import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.latihan_pam_3.databinding.FragmentBinding

class FragmentActivity: Fragment() {

    private var _binding: FragmentBinding? = null // Binding untuk fragment
    private val binding get() = _binding!! // Variabel binding yang aman

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Menginisialisasi binding
        _binding = FragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        // Mendapatkan data dari bundle
        val message = arguments?.getString("mText")

        // Menetapkan data yang diterima ke TextView menggunakan View Binding
        binding.fragmentTextView.text = "Dear ITERA : \n\n$message"

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null // Menghindari memory leak
    }
}
