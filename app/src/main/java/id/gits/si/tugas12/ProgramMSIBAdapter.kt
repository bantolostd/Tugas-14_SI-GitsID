package id.gits.si.tugas12

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ProgramMSIBAdapter(private val listProgram: ArrayList<ProgramMSIB>):
    RecyclerView.Adapter<ProgramMSIBAdapter.CardViewViewHolder>() {
    inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var iconKategori: ImageView = itemView.findViewById(R.id.ic_item_kategori)
        var tvNama : TextView = itemView.findViewById(R.id.tv_item_nama)
        var tvDeskripsi : TextView = itemView.findViewById(R.id.tv_item_deskripsi)
        var tvKota: TextView = itemView.findViewById(R.id.tv_item_kotaperusahaan)
        var tvKategori: TextView = itemView.findViewById(R.id.tv_item_kategori)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_msib, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val program = listProgram[position]
        Glide.with(holder.itemView.context).load(program.photo).apply(RequestOptions()).into(holder.imgPhoto)
        Glide.with(holder.itemView.context).load(program.iconKategori).apply(RequestOptions()).into(holder.iconKategori)
        holder.tvNama.text = program.namaProgram
        holder.tvDeskripsi.text = program.deskripsiProgram
        holder.tvKota.text = program.kotaPerusahaan
        holder.tvKategori.text = program.kategoriProgram

        holder.itemView.setOnClickListener {
            //Toast.makeText(holder.itemView.context, "Kamu memilih "+listProgram[holder.adapterPosition].namaProgram, Toast.LENGTH_SHORT).show()
            val intent = Intent(holder.itemView.context, DetailProgramMSIB::class.java)
            intent.putExtra("tvNama", program.namaProgram)
            intent.putExtra("tvPerusahaan", program.namaPerusahaan)
            intent.putExtra("tvDeskripsi", program.deskripsiProgram)
            intent.putExtra("tvKota", program.kotaPerusahaan)
            intent.putExtra("tvKategori", program.kategoriProgram)
            intent.putExtra("ivIconPerusahaan", program.photo)
            holder.itemView.context.startActivities(arrayOf(intent))

        }
    }

    override fun getItemCount(): Int {
        return listProgram.size
    }
}