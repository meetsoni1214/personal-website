package com.meetsoni.website.styles

import com.meetsoni.website.util.Res
import com.varabyte.kobweb.compose.css.CSSTransition
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.rotate
import com.varabyte.kobweb.compose.ui.modifiers.transition
import com.varabyte.kobweb.silk.components.style.ComponentStyle
import com.varabyte.kobweb.silk.components.style.hover
import org.jetbrains.compose.web.css.deg
import org.jetbrains.compose.web.css.ms

val SocialIconStyle by ComponentStyle {
    base {
        Modifier
            .rotate(0.deg)
            .background(Colors.Transparent)
            .transition(
                CSSTransition(property = "rotate", duration = 300.ms),
                CSSTransition(property = "background", duration = 300.ms),
            )
    }
    hover {
        Modifier
            .rotate(10.deg)
            .background(Res.Theme.SOCIAL_ICON_BACKGROUND_LIGHT.color)
    }
}