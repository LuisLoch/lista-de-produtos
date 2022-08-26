package br.unigran.listadecompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText etProduto, etMarca, etPreco;
    ListView lvListaProdutos;
    List dadosLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etProduto = findViewById(R.id.nomeProdutoId);
        etMarca = findViewById(R.id.marcaProdutoId);
        etPreco = findViewById(R.id.precoProdutoId);
        lvListaProdutos = findViewById(R.id.listaId);

        dadosLista = new ArrayList();

        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, dadosLista);
        lvListaProdutos.setAdapter(adapter);
    }

    public void salvarProduto(View view){
        Compra compra = new Compra();
        compra.setNomeProduto(etProduto.getText().toString());
        compra.setMarcaProduto(etMarca.getText().toString());
        compra.setPrecoProduto(etPreco.getText().toString());
        dadosLista.add(compra);
        Toast.makeText(this, "Produto adicionado à lista.", Toast.LENGTH_SHORT).show();
    }

    public void limparLista(View view){
        dadosLista.clear();
        Toast.makeText(this, "Produtos removidos.", Toast.LENGTH_SHORT).show();
    }
}