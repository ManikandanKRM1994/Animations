package com.krm.animations.anim.bouncing_entrances

import android.animation.ObjectAnimator
import android.view.View
import com.krm.animations.anim.BaseViewAnimator

class BounceInLeftAnimator : BaseViewAnimator() {
    public override fun prepare(target: View?) {
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(
                target,
                "translationX",
                -target!!.width.toFloat(),
                30f,
                -10f,
                0f
            ),
            ObjectAnimator.ofFloat(target, "alpha", 0f, 1f, 1f, 1f)
        )
    }
}