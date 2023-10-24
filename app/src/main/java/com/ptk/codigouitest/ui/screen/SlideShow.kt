@file:OptIn(ExperimentalFoundationApi::class)

package com.ptk.codigouitest.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import com.ptk.codigouitest.ui.composables.DotsIndicator
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun SlideShow(images: List<Int>, pagerState: PagerState, onClick: () -> Unit) {
    Column(modifier = Modifier.fillMaxSize()) {
        HorizontalPager(
            pageCount = 3,
            state = pagerState,
            userScrollEnabled = false,
        ) { pageIndex ->

            Box(modifier = Modifier
                .fillMaxWidth()
                .clickable { onClick.invoke() }) {
                Image(
                    painter = painterResource(id = images[pageIndex]),
                    contentDescription = "Aquarium Wallpaper",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.sdp),
                    contentScale = ContentScale.FillBounds

                )
                DotsIndicator(
                    totalDots = 3,
                    selectedIndex = pageIndex,
                    selectedColor = Color.Red,
                    unSelectedColor = Color.White,
                )


            }
        }
    }
}