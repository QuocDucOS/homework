package com.t3h.firstproject.animation

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.t3h.firstproject.R
import com.t3h.firstproject.databinding.HomeWorkBinding

class HomeWork : AppCompatActivity(), Runnable {
    val had = Handler()
    private lateinit var binding: HomeWorkBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.home_work)
        img1()
        img2()
        img3()
        txt()

        had.postDelayed(this, 10000)

    }

    private fun img1() {

        val rot = ObjectAnimator.ofFloat(binding.img1, "rotation", 0f, 45f)
        rot.setDuration(1000)
        rot.start()
        val obx = ObjectAnimator.ofFloat(binding.img1, "translationX", -400f, 200f)

        val alph = ObjectAnimator.ofFloat(binding.img1, "alpha", 1.5f, 0f)

        val oby = ObjectAnimator.ofFloat(binding.img1, "translationY", 400f, 400f)

        val set = AnimatorSet()
        set.setDuration(3000)

        set.playTogether(obx, oby)
        set.start()
        alph.setDuration(10000)
        alph.start()
    }

    private fun img2() {
        val rot = ObjectAnimator.ofFloat(binding.img2, "rotation", 0f, 135f)
        rot.setDuration(1000)
        rot.start()
        val obx = ObjectAnimator.ofFloat(binding.img2, "translationX", 400f, -200f)

        val alph = ObjectAnimator.ofFloat(binding.img2, "alpha", 1.5f, 0f)

        val oby = ObjectAnimator.ofFloat(binding.img2, "translationY", 400f, 400f)

        val set = AnimatorSet()
        set.setDuration(3000)

        set.playTogether(obx, oby)
        set.start()
        alph.setDuration(10000)
        alph.start()
    }

    private fun img3() {
        val rot = ObjectAnimator.ofFloat(binding.img3, "rotation", 0f, 90f)
        rot.setDuration(1000)
        rot.start()
        val obx = ObjectAnimator.ofFloat(binding.img3, "translationX", 0f, 0f)

        val alph = ObjectAnimator.ofFloat(binding.img3, "alpha", 1.5f, 0f)

        val oby = ObjectAnimator.ofFloat(binding.img3, "translationY", 1000f, -400f)

        val set = AnimatorSet()
        set.setDuration(3000)

        set.playTogether(obx, oby)
        set.start()
        alph.setDuration(10000)
        alph.start()

    }

    private fun txt() {
        val alph = ObjectAnimator.ofFloat(binding.txt1, "alpha", 1.5f, 0f)
        alph.setDuration(10000)

        alph.start()
    }

    private fun txt2() {

        val alph = ObjectAnimator.ofFloat(binding.txt2, "alpha", 0f, 1.5f)
        alph.setDuration(5000)
        alph.start()
    }

    private fun img4() {

        val alph = ObjectAnimator.ofFloat(binding.img4, "alpha", 0f, 1.5f)
        alph.setDuration(5000)
        alph.start()

    }

    private fun img5() {

        val obx = ObjectAnimator.ofFloat(binding.img5, "translationX", 0f, 0f)

        val oby = ObjectAnimator.ofFloat(binding.img5, "translationY", 0f, 673f)
        val alph = ObjectAnimator.ofFloat(binding.img5, "alpha", 1.5f, 0f)
        val set = AnimatorSet()
        set.setDuration(3000)
        set.playTogether(obx, oby)
        set.start()

        alph.setDuration(10000)
        alph.start()

    }

    private fun img6() {

        val obx = ObjectAnimator.ofFloat(binding.img6, "translationX", 0f, 0f)
        val oby = ObjectAnimator.ofFloat(binding.img6, "translationY", 0f, -673f)
        val alph = ObjectAnimator.ofFloat(binding.img6, "alpha", 1.5f, 0f)
        val set = AnimatorSet()
        set.setDuration(3000)
        set.playTogether(obx, oby)
        set.start()
        alph.setDuration(10000)
        alph.start()

    }

    override fun run() {

        binding.txt2.visibility = View.VISIBLE
        binding.img5.visibility = View.VISIBLE
        binding.img6.visibility = View.VISIBLE
        binding.img4.visibility = View.VISIBLE
        img5()
        img6()
        img4()
        txt2()

        had.postDelayed(Runnable {
            val alph = ObjectAnimator.ofFloat(binding.img4, "alpha", 1.5f, 0f)
            alph.setDuration(9000)
            alph.start()
            val alph1 = ObjectAnimator.ofFloat(binding.txt2, "alpha", 1.5f, 0f)
            alph1.setDuration(9000)
            alph1.start()
        }, 1000)
        had.postDelayed(Runnable {
            binding.txt3.visibility = View.VISIBLE
            countdown()
            img7()
            img8()
            img9()
        }, 9000)
        had.postDelayed(Runnable {
            val alph = ObjectAnimator.ofFloat(binding.img7, "alpha", 1.5f, 0f, 1.5f)
            alph.setDuration(2000)
            alph.start()
            val alph1 = ObjectAnimator.ofFloat(binding.img8, "alpha", 1.5f, 0f, 1.5f)
            alph1.setDuration(2500)
            alph1.start()
            val alph2 = ObjectAnimator.ofFloat(binding.img9, "alpha", 1.5f, 0f, 1.5f)
            alph2.setDuration(3000)
            alph2.start()
        }, 10000)
        had.postDelayed(Runnable {
            binding.img7.visibility = View.INVISIBLE
            binding.img8.visibility = View.INVISIBLE
            binding.img9.visibility = View.INVISIBLE
            binding.img10.visibility = View.VISIBLE
            binding.img11.visibility = View.VISIBLE
            binding.img12.visibility = View.VISIBLE
            val obx = ObjectAnimator.ofFloat(binding.img11, "translationX", 0f, 0f)
            val oby = ObjectAnimator.ofFloat(binding.img11, "translationY", 0f, -420f)
            val set = AnimatorSet()
            set.setDuration(2000)
            set.playTogether(obx, oby)
            set.start()
            val obx1 = ObjectAnimator.ofFloat(binding.img12, "translationX", 0f, 0f)
            val oby1 = ObjectAnimator.ofFloat(binding.img12, "translationY", 0f, -2 * 420f)
            val set1 = AnimatorSet()
            set1.setDuration(2000)
            set1.playTogether(obx1, oby1)
            set1.start()
        }, 12000)
        had.postDelayed(Runnable {
            binding.btn.visibility = View.VISIBLE

        }, 15000)

    }

    private fun img7() {

        binding.img7.visibility = View.VISIBLE

        val alph = ObjectAnimator.ofFloat(binding.img7, "alpha", 0f, 1.5f)

        alph.setDuration(2000)
        alph.start()
    }

    private fun img8() {

        binding.img8.visibility = View.VISIBLE

        val alph = ObjectAnimator.ofFloat(binding.img8, "alpha", 0f, 1.5f)

        alph.setDuration(2500)
        alph.start()
    }

    private fun img9() {

        binding.img9.visibility = View.VISIBLE

        val alph = ObjectAnimator.ofFloat(binding.img9, "alpha", 0f, 1.5f)

        alph.setDuration(3500)
        alph.start()
    }

    private fun countdown() {
        binding.txt4.visibility = View.VISIBLE
        var cdtt = 6
        val timer = object : CountDownTimer(50000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                cdtt--
                if (cdtt >= 0) {
                    binding.txt4.text = cdtt.toString()
                }

            }

            override fun onFinish() {

            }
        }
        timer.start()
    }
}