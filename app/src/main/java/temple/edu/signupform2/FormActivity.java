package temple.edu.signupform2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FormActivity extends AppCompatActivity {


    private Button saveButton;
    // FormActivity sign in information.
    private String inputName;
    private String inputEmail;
    private String inputpassword;
    private String inputpasswordConfirm;

    EditText nmText;
    EditText emText;
    EditText psText;
    EditText confText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nmText = (EditText)findViewById(R.id.nameText);
        emText = (EditText)findViewById(R.id.emailText);
        psText = (EditText)findViewById(R.id.passwordText);
        confText = (EditText)findViewById(R.id.confirmText);

        saveButton = findViewById(R.id.saveButton);
        saveButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view)
            {
                //Toast toast = Toast.makeText(getApplicationContext() , "You have clicked the button", Toast.LENGTH_LONG);
                //toast.show();
                Boolean isError = false;
                 // Get input values
                inputName = nmText.getText().toString();
                inputEmail = emText.getText().toString();
                inputpassword = psText.getText().toString();
                inputpasswordConfirm = confText.getText().toString();

                if(inputName.isEmpty() || inputEmail.isEmpty() || inputpassword.isEmpty() || inputpasswordConfirm.isEmpty())
                {
                    Toast toast = Toast.makeText(getApplicationContext() , "Please fill in every field", Toast.LENGTH_LONG);
                    toast.show();
                    isError = true;
                }

                if(inputpassword.compareTo(inputpasswordConfirm) != 0)
                {
                    Toast toast = Toast.makeText(getApplicationContext() , "Password does not match", Toast.LENGTH_LONG);
                    toast.show();
                    isError = true;
                }

                if(isError == false)
                {
                    Toast toast = Toast.makeText(getApplicationContext() , "Hello " + inputName + ", welcome to the Sign Up Form App!", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });


    }
}
