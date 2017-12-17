package com.example.fatih.mehmetfatihinan_kamalpreetsigh_mapd711_onlinepurchase;

import android.content.ContentValues;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;




public class LoginActivity extends AppCompatActivity {


    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private View mProgressView;
    private View mLoginFormView;
    private Boolean isClerk = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        String tables1[]={"clerk"};
        String tableCreatorString1[] = {"CREATE TABLE clerk ( employeeId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, userName TEXT NOT NULL UNIQUE, password TEXT, firstname TEXT, lastname TEXT);"};

        final DatabaseManager db = new DatabaseManager(this);
        db.dbInitialize( tables1,tableCreatorString1);


        String tables2[]={"customer"};
        String tableCreatorString2[] = {"CREATE TABLE customer ( customerId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, userName TEXT NOT NULL UNIQUE, password TEXT, firstname TEXT, lastname TEXT, address TEXT, city TEXT, postalcode TEXT );"};
        db.dbInitialize( tables2,tableCreatorString2);


        final String tables3[]={"order"};
        String tableCreatorString3[] = {"CREATE TABLE order ( orderId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, customerId INTEGER NOT NULL, productId INTEGER NOT NULL, quantity INTEGER NOT NULL, price REAL, shipped INTEGER NOT NULL, orderdate NUMERIC NOT NULL );"};
        db.dbInitialize( tables3,tableCreatorString3);

        String tables4[]={"product"};
        String tableCreatorString4[] = {"CREATE TABLE product ( productId INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT UNIQUE, productName TEXT NOT NULL UNIQUE, price REAL NOT NULL, quantity INTEGER NOT NULL, image BLOB );"};
        db.dbInitialize( tables4,tableCreatorString4);

        String tables5[]={"shoppingcart"};
        String tableCreatorString5[] = {"CREATE TABLE shoppingcart ( customerId INTEGER NOT NULL, productId INTEGER NOT NULL, quantity INTEGER NOT NULL, price INTEGER NOT NULL );"};
        db.dbInitialize( tables5,tableCreatorString5);

        final String fields[] = {"customerId", "productId", "quantity", "price"};
        final int[] record = new int[4];

        final TextView display = (TextView) findViewById(R.id.display);

        final Button btnShowStudent = (Button) findViewById(R.id.email_sign_in_button);
        btnShowStudent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                record[0]=1;
                record[1]=2;
                record[2]=3;
                record[3]=4;
//                Log.d("Name: ", record[1]);
                //populate the row with some values
                ContentValues values = new ContentValues();
                //for (int i=1;i<record.length;i++)
                //values.put(fields[i],record[i]);
                //add the row to the database
                db.addRecord(values, "shoppingcart", fields,record);


                // Reading all records
                List table = db.getTable("shoppingcart");

                for (Object o : table) {
                    ArrayList row = (ArrayList)o;
                    // Writing table to log
                    String output="";
                    for (int i=0;i<row.size();i++)
                    {
                        output+= row.get(i).toString() + " ";
                        output+="\n";
                    }
                    display.setText(output);

                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.clerkmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {

        switch (item.getItemId()) {
            case R.id.clerk:
                Toast.makeText(this, "You are in Clerk Mode ", Toast.LENGTH_LONG).show();
                Intent i = new Intent(LoginActivity.this, Products.class);

                startActivity(i);
        }


        return super.onOptionsItemSelected(item);
    }
}