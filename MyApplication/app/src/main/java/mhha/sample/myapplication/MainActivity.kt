package mhha.sample.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SAM
        //Single Abstract Method
        //단일 추상 메서드
        //자바 함수형 인터페이스 관계에서 유래됨
        //함수형 인터페이스를 인자로 받는 자바 함수를 호출 할 때 인터페이스 객체를 람다로 넘길 수 있다

        val view = View(this)
        // Java 에서
//        view.setOnClickListener {
//            new View.onClickListener(){
//                @Override
//                public void onClic(View:view){
//
//                }
//            }
//        }
        // Kotlin 에서
        view.setOnClickListener({println("클릭")})
    }
}