package com.krm.animations.anim.zooming_entrances

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class ZoomInDownAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "scaleX", 0.1f, 0.475f, 1f),
            ObjectAnimator.ofFloat(target, "scaleY", 0.1f, 0.475f, 1f),
            ObjectAnimator.ofFloat(target, "translationY", -target!!.bottom.toFloat(), 60f, 0f),
            ObjectAnimator.ofFloat(target, "alpha", 0f, 1f, 1f)
        )
    }
}