package senac.macariocalcados.adapters;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;
import java.util.Random;
import senac.macariocalcados.R;
import senac.macariocalcados.models.Sapato;


public class SapatosAdapter extends RecyclerView.Adapter<SapatosAdapter.SapatoViewHolder> {
    private List<Sapato> sapatoDataList;

    public SapatosAdapter (List<Sapato> sapatoDataList) {

        this.sapatoDataList = sapatoDataList;
    }

    @NonNull
    @Override
    public SapatoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.itens_sapatos, viewGroup, false);

        return new SapatoViewHolder(itemView);
    }


    @Override
    public void onBindViewHolder(@NonNull SapatoViewHolder viewHolder, int i) {
        Sapato data = sapatoDataList.get(i);

        viewHolder.nome.setText(data.getNome());
        viewHolder.valor.setText(String.valueOf(data.getValor()));
       // viewHolder.imgsapato.    ;
       Picasso.get()
               .load( "https://cdnv2.moovin.com.br/sapatogrande/imagens/produtos/original/sapato-scatamacchia-ld-01-cor-preto-bcf2b372e5b370129c2ca005b673dfd4.jpg" )
               .into(viewHolder.imgsapato);

    }

    @Override
    public int getItemCount() {
        return sapatoDataList.size();
    }

    class SapatoViewHolder extends RecyclerView.ViewHolder {
        TextView nome,valor;
        ImageView imgsapato;
        LinearLayout parent;
        public SapatoViewHolder(View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.txtnome);
            valor=itemView.findViewById(R.id.txtvalor);
            imgsapato=itemView.findViewById(R.id.imgSapato);

        }
    }
}

