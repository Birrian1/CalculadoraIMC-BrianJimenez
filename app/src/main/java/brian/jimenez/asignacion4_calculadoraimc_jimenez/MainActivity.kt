package brian.jimenez.asignacion4_calculadoraimc_jimenez

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val peso : EditText  = findViewById(R.id.etPeso) as EditText
        val estatura : EditText  = findViewById(R.id.etEstatura) as EditText
        val calcular: Button = findViewById(R.id.btnCalcular)
        val tvimc: TextView = findViewById(R.id.tvImc)
        val tvrage: TextView = findViewById(R.id.tvRange)



        calcular.setOnClickListener {

            val pesoD = peso?.text.toString()
            val estaturaD = estatura?.text.toString()

            var imc = pesoD.toDouble() / (estaturaD.toDouble() * estaturaD.toDouble())
            var info=""
            when(imc){
                in 0.0..18.5 ->{
                    info="Su peso en inferior al normal"
                }
                in 18.5..24.9 ->{
                    info="Su peso es normal"
                }
                in 25.0..29.9->{
                    info="Esta en sobrepeso"
                }
                in 30.0..34.9 ->{
                    info="Obesidad grado 1"
                }
                in 35.0..39.9 ->{
                    info="Obesidad grado 2"
                }
                in 40.0..100000.0 ->{
                    info="Obesidad grado 3"
                }
            }
            tvimc.setText(imc.toString())
            tvrage.setText(info)

        }














    }
}