package cl.semillafamiliar.tareasfamiliares.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import cl.semillafamiliar.tareasfamiliares.R
import cl.semillafamiliar.tareasfamiliares.enum.UtilStringEnum
import kotlinx.android.synthetic.main.activity_start.*

class StartActivity : ToolbarActivity(){

  override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)


      toolbarToLoad(toolbar as Toolbar)

      title = UtilStringEnum.BIENVENIDO.text
        //setup
        setup()

    }

    private fun setup(){
        padreButton.setOnClickListener{
            showLogin()
        }

        hijoButton.setOnClickListener {
            showLoginHijo()
        }
    }

    private fun showLogin() {
        title = UtilStringEnum.INICIO_PADRE.text
        val loginIntent = Intent(this, AuthActivity::class.java)
        startActivity(loginIntent)
    }

    private fun showLoginHijo() {
        title = UtilStringEnum.INICIO_HIJO.text
        val loginIntent = Intent(this, AuthHijoActivity::class.java)
        startActivity(loginIntent)
    }


}