package com.example.roomslink;

import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.roomslink.R;

import java.io.IOException;

public class SignupFrag extends Fragment {

     private static final   String url ="http://localhost/php/";

     ImageView imge1 ,imge2,imge3;
     Button btn;
    Bitmap bitmap1 ,bitmap2 ,bitmap3;
    String email ;
    //ContentResolver contentResolver;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.signupactivity, container, false);

        imge1 = view.findViewById(R.id.img1);
        imge2 = view.findViewById(R.id.img2);
        imge3 = view.findViewById(R.id.img3);
        btn = view.findViewById(R.id.upload);
          Bundle bundle = this.getArguments();
          email = bundle.getString("email");
           btn.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Serverdata();
               }
           });

        ActivityResultLauncher  resultLauncher, resultLauncher1  ,resultLauncher2 ;

        resultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {

                Intent intent = result.getData();
                if (intent !=null) {

                    try {

                        bitmap1= MediaStore.Images.Media.getBitmap( getContentResolver(), intent.getData());

                        imge1.setImageBitmap(bitmap1);

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

//
            }


        });
          resultLauncher1 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {

              @Override
            public void onActivityResult(ActivityResult result) {

                Intent intent = result.getData();
                if (intent !=null) {

                    try {

                        bitmap2= MediaStore.Images.Media.getBitmap(getContentResolver(), intent.getData());

                        imge2.setImageBitmap(bitmap2);


                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
          resultLauncher2 = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {

                Intent intent = result.getData();
                if (intent !=null) {

                    try {

                        bitmap3= MediaStore.Images.Media.getBitmap(getContentResolver(), intent.getData());



                        imge3.setImageBitmap(bitmap3);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

//
            }


        });






        imge1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");

                resultLauncher.launch(intent);

//                Intent intent =new Intent(Intent.ACTION_PICK);
//                intent.setType("image/*");
//
//                resultLauncher.launch(intent);
                // folow(resultLauncher);

            }

        });


        imge2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v)
            {

                Intent intent =new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");

                resultLauncher1.launch(intent);
                //image1.setImageBitmap(arr.get(1));
                //  folow(resultLauncher);

            }

        });

        imge3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");

                resultLauncher2.launch(intent);

                // image2.setImageBitmap(arr.get(2));
                //folow(resultLauncher);

            }

        });





        return view;
    }

    private void Serverdata() {




    }


}