package marketplace.jpr.com.demoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
private EditText id,pwd;
private Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        id=findViewById(R.id.edit_email);
        pwd=findViewById(R.id.edit_password);

        login=findViewById(R.id.login);





        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean check=true;

                String gmaill=id.getText().toString();
                String passworddd=pwd.getText().toString();




                if(!Patterns.EMAIL_ADDRESS.matcher(gmaill).matches())
                {
                    id.setError("Field is empty");
                    check=false;
                }


                if(passworddd.length()<4)
                {
                    pwd.setError("enter more than 10 charater");
                    check=false;
                }
                if (check==true)
                {
                    Toast.makeText(LoginActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(LoginActivity.this,DashBoardActivity.class);

                    intent.putExtra("USERNAME","gmail");
                    intent.putExtra("PASSWORD","password");
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }


            }
        });






    }
}
