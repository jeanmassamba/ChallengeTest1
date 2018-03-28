package cg.beto.massamba.challenge5;

import android.widget.Toast;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.content.Intent;
        import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button btn;
    EditText txtEmail,txtPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn=(Button) findViewById(R.id.btn_login);

        txtEmail=(EditText) findViewById(R.id.tv_email);
        txtPwd=(EditText) findViewById(R.id.tv_password);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtEmail.getText().toString().equals("") || txtPwd.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(),"Votre email ou votre mot de passe est vide !!!",Toast.LENGTH_LONG).show();
                }
                else {
                    if (txtEmail.getText().toString().equals("ghost")){
                        Toast.makeText(getApplicationContext(),"Votre email est invalide !!!",Toast.LENGTH_LONG).show();
                    }
                    else {
                        if (!txtEmail.getText().toString().equals("abimaelkouka@gmail.com")){
                            Toast.makeText(getApplicationContext(),"Votre email est incorect !!!",Toast.LENGTH_LONG).show();
                        }
                        else{
                            if (txtPwd.getText().toString().length()<5){
                                Toast.makeText(getApplicationContext(),"Votre mot de passe est trop court !!!",Toast.LENGTH_LONG).show();
                            }
                            else{

                                if ((txtEmail.getText().toString().equals("abimaelkouka@gmail.com")) && txtPwd.getText().toString().equals("abimael")){
                                    Toast.makeText(getApplicationContext(),"Connexion reussie !!!",Toast.LENGTH_LONG).show();
                                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                                    startActivity(intent);
                                }
                                else{
                                    Toast.makeText(getApplicationContext(),"Verifier vos informations !!!",Toast.LENGTH_LONG).show();
                                }
                            }
                        }
                    }
                }


            }
        });
    }
}