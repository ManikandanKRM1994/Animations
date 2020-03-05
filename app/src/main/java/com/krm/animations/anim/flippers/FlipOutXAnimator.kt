package com.krm.animations.anim.flippers

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class FlipOutXAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "rotationX", 0f, 90f),
            ObjectAnimator.ofFloat(target, "alpha", 1f, 0f)
        )
    }
}