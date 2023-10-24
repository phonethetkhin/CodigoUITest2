@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)

package com.ptk.codigouitest.ui.screen

import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import com.ptk.codigouitest.R
import com.ptk.codigouitest.ui.theme.LightGrey
import com.ptk.codigouitest.ui.theme.Pink
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp
import kotlinx.coroutines.delay


@Composable
fun DetailDialog(
    showDialog: Boolean,
    onDismissRequest: () -> Unit,
) {
    if (showDialog) {
        var page by remember { mutableStateOf(0) }
        val pagerState = rememberPagerState()
        LaunchedEffect(Unit) {
            while (true) {
                delay(5000L)

                if (page == 2) {
                    page = 0
                } else {
                    page += 1
                }
                pagerState.animateScrollToPage(
                    page = page,
                    animationSpec = spring(
                        dampingRatio = Spring.DampingRatioLowBouncy,
                        visibilityThreshold = 3F,
                        stiffness = Spring.StiffnessVeryLow
                    )
                )

            }
        }
        Dialog(
            onDismissRequest = { onDismissRequest.invoke() },
            properties = DialogProperties(usePlatformDefaultWidth = false)
        ) {
            Card(
                Modifier.fillMaxWidth(), colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                ),
                shape = RoundedCornerShape(10.sdp),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 10.dp
                )
            ) {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                ) {
                    Box {
                        val images = arrayListOf(
                            R.drawable.alligatorgar,
                            R.drawable.aligatorgar2,
                            R.drawable.aligatorgar3
                        )
                        SlideShow(images = images, pagerState = pagerState) {}
                        Icon(
                            painterResource(id = R.drawable.baseline_close_24),
                            contentDescription = "CloseIcon",
                            modifier = Modifier
                                .size(30.sdp)
                                .align(Alignment.TopStart)
                                .drawBehind { drawCircle(Color.White, 25F) }
                                .padding(8.sdp)
                                .clickable { onDismissRequest.invoke() }
                        )
                    }

                    Text(
                        "Zone 1",
                        fontSize = 11.ssp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.sdp, top = 16.sdp, end = 8.sdp)
                    )

                    Text(
                        "Alligator Gar",
                        fontSize = 20.ssp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.sdp, top = 16.sdp, end = 8.sdp)
                    )

                    MapInfoLayout()

                    Text(
                        "With it's wide, alligator-like snout and razor-sharp teeth, it's easy to see how this fish acquired it's name. Despite its ferocious appearance, the alligator gar poses little threat to human beings. They prefer to lie and wait for unsuspecting prey within reach, before lunging forward to grab their prey.\n\nAs the largest species in the gar family, the alligator gar can reach up to 3 metres in length. Scientists have traced this species in fossil records dating back to 100 million years ago, hence they are also known as living fossils!",
                        fontSize = 11.ssp,
                        color = Color.Black,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 8.sdp, top = 16.sdp, end = 8.sdp, bottom = 16.sdp)
                    )
                }

            }
        }
    }
}

@Composable
fun MapInfoLayout() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(start = 8.sdp, top = 16.sdp)
            .border(
                1.dp, LightGrey,
                RoundedCornerShape(10.sdp)
            )
    ) {
        Icon(
            painter = painterResource(id = R.drawable.walk_icon),
            contentDescription = "WalkIcon",
            modifier = Modifier
                .size(20.sdp)
                .padding(start = 8.sdp)
        )
        Text("410m away", fontSize = 11.ssp, modifier = Modifier.padding(start = 4.sdp))
        TextButton(onClick = {}) {
            Text("Map", color = Pink, fontSize = 11.ssp)
        }
    }
}