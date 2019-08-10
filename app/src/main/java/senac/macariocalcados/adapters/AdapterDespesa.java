package senac.macariocalcados.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import senac.macariocalcados.R;
import senac.macariocalcados.models.Despesa;

public class AdapterDespesa extends RecyclerView.Adapter<AdapterDespesa.MyViewHolder> {

    List<Despesa> despesas;
    Context context;
    CardView cardView;

    public AdapterDespesa(List<Despesa> despesas, Context context) {
        this.despesas = despesas;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.barradepesquisa, parent, false);  // falta layout despesa retirar o barra de pesquisa
    return new MyViewHolder(itemLista);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Despesa despesa = despesas.get(position);

        holder.descricao.setText(despesa.getDescricao());
        holder.valor.setText(String.valueOf(despesa.getValor()));
        holder.categoria.setText(despesa.getCategoria());
        holder.data.setText(String.valueOf(despesa.getData()));

    }


    @Override
    public int getItemCount() {
        return despesas.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView descricao, valor, categoria, data;

        RecyclerView recyclerView;
        public MyViewHolder(View itemView) {
            super(itemView);

        //    descricao = itemView.findViewById(R.id.textAdapterDescricaoDespesa);
        //    valor = itemView.findViewById(R.id.textAdapterValorDespesa);
        //    categoria = itemView.findViewById(R.id.textAdapterCategoriaDespesa);
        //    data = itemView.findViewById(R.id.textAdapterDataDespesa);
        //   cardView = itemView.findViewById(R.id.cardViewAdapterDespesa);
        //    recyclerView = itemView.findViewById(R.id.recycleViewDespesas);

        // ---  falta fazer layout despesas

        }

    }
}
