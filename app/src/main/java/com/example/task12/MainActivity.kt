package com.example.task12

import android.animation.AnimatorInflater
import android.os.Bundle
import android.view.animation.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animator = AnimatorInflater.loadAnimator(this,R.animator.anim_trans)
        animator.setTarget(top)
        start.setOnClickListener{
            animator.start()
        }

        var a=1
        stop.setOnClickListener{
           animator.pause()
            for(i in 1..100000000){
                a++
            }

          setContentView(R.layout.result_layout)
        }
    }
}
