package com.krm.animations.anim.fading_entrances

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class FadeInLeftAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0f, 1f),
            ObjectAnimator.ofFloat(target, "translationX", -target!!.width / 4.toFloat(), 0f)
        )
    }
}