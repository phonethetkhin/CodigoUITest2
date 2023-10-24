package com.ptk.codigouitest.ui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ir.kaaveh.sdpcompose.sdp

@Composable
fun BoxScope.DotsIndicator(
    totalDots: Int,
    selectedIndex: Int,
    selectedColor: Color,
    unSelectedColor: Color,
) {

    LazyRow(
        Modifier
            .align(Alignment.BottomCenter)
            .padding(bottom = 8.sdp)
    ) {

        items(totalDots) { index ->
            if (index == selectedIndex) {
                Spacer(
                    modifier = Modifier
                        .height(5.sdp)
                        .width(40.sdp)
                        .clip(RoundedCornerShape(8.sdp))
                        .background(selectedColor)

                )
            } else {
                Spacer(
                    modifier = Modifier
                        .height(5.sdp)
                        .width(40.sdp)
                        .clip(RoundedCornerShape(8.sdp))
                        .background(unSelectedColor)

                )
            }

            if (index != totalDots - 1) {
                Spacer(modifier = Modifier.padding(horizontal = 4.dp))
            }
        }
    }
}