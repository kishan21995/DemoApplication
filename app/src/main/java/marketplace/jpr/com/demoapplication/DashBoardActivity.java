package marketplace.jpr.com.demoapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DashBoardActivity extends AppCompatActivity {
private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        img=findViewById(R.id.img1);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DashBoardActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });

    }
}
