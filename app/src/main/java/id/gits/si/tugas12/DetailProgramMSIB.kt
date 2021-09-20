package id.gits.si.tugas12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.gits.si.tugas12.databinding.ActivityDetailProgramMsibBinding

class DetailProgramMSIB : AppCompatActivity() {

    private lateinit var binding: ActivityDetailProgramMsibBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailProgramMsibBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val back = findViewById<ImageView>(R.id.left_icon)
        val data = intent.extras
        if(data != null) {
            binding.imgItemPhoto.setImageResource(data.getInt("ivIconPerusahaan", -1))
            binding.tvItemNama.text = data.getString("tvNama")
            binding.tvItemDeskripsi.text = data.getString("tvDeskripsi")
            binding.tvItemNamaperusahaan.text = data.getString("tvPerusahaan")
            binding.tvItemKotaperusahaan.text = data.getString("tvKota")
        }

        back.setOnClickListener() {
            super.onBackPressed()
        }

    }
}