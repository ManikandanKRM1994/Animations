package com.krm.animations.anim.specials.`in`

import android.animation.ObjectAnimator
import android.view.View
import com.daimajia.easing.Glider
import com.daimajia.easing.Skill
import com.krm.animations.anim.BaseViewAnimator

class DropOutAnimator : BaseViewAnimator() {
    override fun prepare(target: View?) {
        val distance = target!!.top + target.height
        animatorAgent!!.playTogether(
            ObjectAnimator.ofFloat(target, "alpha", 0f, 1f),
            Glider.glide(
                Skill.BounceEaseOut,
                duration.toFloat(),
                ObjectAnimator.ofFloat(target, "translationY", -distance.toFloat(), 0f)
            )
        )
    }
}