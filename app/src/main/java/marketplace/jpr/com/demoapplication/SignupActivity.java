package marketplace.jpr.com.demoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {
  private EditText name,username,email,mobile,password;
  private Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        name=findViewById(R.id.name);
        username=findViewById(R.id.username);
        email=findViewById(R.id.emailid);
        mobile=findViewById(R.id.mobile);
        password=findViewById(R.id.password);
        reg=findViewById(R.id.reg_BTN);



        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean check=true;

                String namee=name.getText().toString();
                String usernamee=username.getText().toString();
                String emaill=email.getText().toString();
                String mobilee=mobile.getText().toString();
                String passwordd=password.getText().toString();



                if (namee.length()<2) {
                    name.setError("enter valid name");
                    check = false;

                }


                if (usernamee.length()<2) {
                    username.setError("enter valid user name");
                    check = false;

                }

                if(!Patterns.EMAIL_ADDRESS.matcher(emaill).matches())
                {
                    email.setError("Field is empty");
                    check=false;
                }

                if (mobile.length()<10) {
                    password.setError("enter valid mobile number");
                    check = false;
                }
                if(passwordd.length()<4)
                {
                    password.setError("enter valid password");
                    check=false;
                }
                if (check==true)
                {
                    Toast.makeText(SignupActivity.this, "Signup Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(SignupActivity.this,LoginActivity.class);

                    intent.putExtra("USERNAME","gmail");
                    intent.putExtra("PASSWORD","password");
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(SignupActivity.this, "Signup Failed", Toast.LENGTH_SHORT).show();
                }


            }
        });





    }
}
