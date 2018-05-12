package com.example.macrz.juego_gato;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    int turno, contador, conta=0;
    String letra;

    //Creacion de edittext
    EditText Ed_ganador;

    //Creacion de los botones
    Button Boton1,Boton2,Boton3,Boton4,Boton5,Boton6,Boton7,Boton8,Boton9,limpia, salir ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.activity_main);


        //Referencias
        Ed_ganador=(EditText)findViewById(R.id.Ed_ganador);

        Boton1=(Button) (findViewById(R.id.Boton1));
        Boton2=(Button) (findViewById(R.id.Boton2));
        Boton3=(Button) (findViewById(R.id.Boton3));
        Boton4=(Button) (findViewById(R.id.Boton4));
        Boton5=(Button) (findViewById(R.id.Boton5));
        Boton6=(Button) (findViewById(R.id.Boton6));
        Boton7=(Button) (findViewById(R.id.Boton7));
        Boton8=(Button) (findViewById(R.id.Boton8));
        Boton9=(Button) (findViewById(R.id.Boton9));

        salir=(Button)(findViewById(R.id.salir));
        limpia=(Button)(findViewById(R.id.limpia));

        Boton1.setOnClickListener(this);
        Boton2.setOnClickListener(this);
        Boton3.setOnClickListener(this);
        Boton4.setOnClickListener(this);
        Boton5.setOnClickListener(this);
        Boton6.setOnClickListener(this);
        Boton7.setOnClickListener(this);
        Boton8.setOnClickListener(this);
        Boton9.setOnClickListener(this);

        limpia.setOnClickListener(this);
        salir.setOnClickListener(this);

    }


    @Override

    public void onClick(View v) {

        contador++;
        turno = contador%2;

        if(turno == 1)
        {
            imprimirXO('X', v);
        }
        //Jugador 2    O
        else
        {
            imprimirXO('O',v);

        }

    }


    public void imprimirXO(char letra, View v)
    {

//Limpiar



        if(v.getId() == R.id.limpia)
        {
            Ed_ganador.setEnabled(true);
            Ed_ganador.setText("");

            Boton1.setEnabled(true);
            Boton1.setText("");

            Boton2.setEnabled(true);
            Boton2.setText("");

            Boton3.setEnabled(true);
            Boton3.setText("");

            Boton4.setEnabled(true);
            Boton4.setText("");

            Boton5.setEnabled(true);
            Boton5.setText("");

            Boton6.setEnabled(true);
            Boton6.setText("");

            Boton7.setEnabled(true);
            Boton7.setText("");

            Boton8.setEnabled(true);
            Boton8.setText("");

            Boton9.setEnabled(true);
            Boton9.setText("");

            conta=0;
        }

        if(v.getId() == R.id.salir)
        {

            System.exit(0);

        }


        if(v.getId()== R.id.Boton1)
        {
            Boton1.setText(letra+"");
            Boton1.setEnabled(false);
        } //

        else if (v.getId()== R.id.Boton2)
        {
            Boton2.setText(letra+"");
            Boton2.setEnabled(false);

        }
        else if (v.getId()== R.id.Boton3)
        {
            Boton3.setText(letra+"");
            Boton3.setEnabled(false);

        }
        else if (v.getId()== R.id.Boton4)
        {
            Boton4.setText(letra+"");
            Boton4.setEnabled(false);

        }
        else if (v.getId()== R.id.Boton5)
        {
            Boton5.setText(letra+"");
            Boton5.setEnabled(false);

        }
        else if (v.getId()== R.id.Boton6)
        {
            Boton6.setText(letra+"");
            Boton6.setEnabled(false);

        }
        else if (v.getId()== R.id.Boton7)
        {
            Boton7.setText(letra+"");
            Boton7.setEnabled(false);

        }
        else if (v.getId()== R.id.Boton8)
        {
            Boton8.setText(letra+"");
            Boton8.setEnabled(false);

        }
        else if (v.getId()== R.id.Boton9)
        {
            Boton9.setText(letra+"");
            Boton9.setEnabled(false);

        }

        Ganador(letra);

    }

    public void Ganador(char letra)
    {


        if((Boton1.getText().toString().equals(letra+"")) && (Boton2.getText().toString().equals(letra+"")) && (Boton3.getText().toString().equals(letra+"")))
        {
            Ed_ganador.setText("Gano: " +letra);
            Ed_ganador.setEnabled(false);

            Boton4.setEnabled(false);
            Boton5.setEnabled(false);
            Boton6.setEnabled(false);
            Boton7.setEnabled(false);
            Boton8.setEnabled(false);
            Boton9.setEnabled(false);
        }
        else if ((Boton4.getText().toString().equals(letra+"")) && (Boton5.getText().toString().equals(letra+"")) && (Boton6.getText().toString().equals(letra+"")))
        {
            Ed_ganador.setText("Gano: " +letra);
            Ed_ganador.setEnabled(false);

            Boton1.setEnabled(false);
            Boton2.setEnabled(false);
            Boton3.setEnabled(false);
            Boton7.setEnabled(false);
            Boton8.setEnabled(false);
            Boton9.setEnabled(false);

        }

        else if ((Boton7.getText().toString().equals(letra+"")) && (Boton8.getText().toString().equals(letra+"")) && (Boton9.getText().toString().equals(letra+"")))
        {
            Ed_ganador.setText("Gano: " +letra);
            Ed_ganador.setEnabled(false);

            Boton1.setEnabled(false);
            Boton2.setEnabled(false);
            Boton3.setEnabled(false);
            Boton4.setEnabled(false);
            Boton5.setEnabled(false);
            Boton6.setEnabled(false);
        }
        else if ((Boton1.getText().toString().equals(letra+"")) && (Boton4.getText().toString().equals(letra+"")) && (Boton7.getText().toString().equals(letra+"")))
        {
            Ed_ganador.setText("Gano: " +letra);
            Ed_ganador.setEnabled(false);

            Boton2.setEnabled(false);
            Boton3.setEnabled(false);
            Boton5.setEnabled(false);
            Boton6.setEnabled(false);
            Boton8.setEnabled(false);
            Boton9.setEnabled(false);
        }
        else if ((Boton2.getText().toString().equals(letra+"")) && (Boton5.getText().toString().equals(letra+"")) && (Boton8.getText().toString().equals(letra+"")))
        {
            Ed_ganador.setText("Gano: " +letra);
            Ed_ganador.setEnabled(false);

            Boton1.setEnabled(false);
            Boton4.setEnabled(false);
            Boton7.setEnabled(false);
            Boton3.setEnabled(false);
            Boton6.setEnabled(false);
            Boton9.setEnabled(false);
        }
        else if ((Boton3.getText().toString().equals(letra+"")) && (Boton6.getText().toString().equals(letra+"")) && (Boton9.getText().toString().equals(letra+"")))
        {
            Ed_ganador.setText("Gano: " +letra);
            Ed_ganador.setEnabled(false);

            Boton1.setEnabled(false);
            Boton2.setEnabled(false);
            Boton4.setEnabled(false);
            Boton5.setEnabled(false);
            Boton7.setEnabled(false);
            Boton8.setEnabled(false);
        }

        else if ((Boton1.getText().toString().equals(letra+"")) && (Boton5.getText().toString().equals(letra+"")) && (Boton9.getText().toString().equals(letra+"")))
        {
            Ed_ganador.setText("Gano: " +letra);
            Ed_ganador.setEnabled(false);

            Boton2.setEnabled(false);
            Boton3.setEnabled(false);
            Boton4.setEnabled(false);
            Boton6.setEnabled(false);
            Boton7.setEnabled(false);
            Boton8.setEnabled(false);
        }

        else if ((Boton3.getText().toString().equals(letra+"")) && (Boton5.getText().toString().equals(letra+"")) && (Boton7.getText().toString().equals(letra+"")))
        {
            Ed_ganador.setText("Gano: " +letra);
            Ed_ganador.setEnabled(false);

            Boton1.setEnabled(false);
            Boton2.setEnabled(false);
            Boton4.setEnabled(false);
            Boton6.setEnabled(false);
            Boton8.setEnabled(false);
            Boton9.setEnabled(false);
        }
        if (conta < 9){
            conta++;
        } else{
            Ed_ganador.setText("Ha sido un empate");
            Ed_ganador.setEnabled(true);
        }

    }

}
