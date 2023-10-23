package com.ptk.codigouitest.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.ptk.codigouitest.R
import com.ptk.codigouitest.ui.theme.Blue
import com.ptk.codigouitest.ui.theme.Gold
import com.ptk.codigouitest.ui.theme.Grey
import com.ptk.codigouitest.ui.theme.LightGrey
import com.ptk.codigouitest.ui.theme.Orange
import com.ptk.codigouitest.ui.theme.Pink
import ir.kaaveh.sdpcompose.sdp
import ir.kaaveh.sdpcompose.ssp

@Composable
fun HomeScreen() {


    HomeScreenContent()
}

@Composable
fun HomeScreenContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        ToolbarLayout()
        SlideShowWallPaper()
        NavigationIconLayout()
        TicketsCardLayout()
        UpcomingShowLayout()
        BottomNavigationViewLayout()
    }
}

@Composable
fun ToolbarLayout() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = CenterVertically
    ) {
        Icon(
            imageVector = Icons.Filled.KeyboardArrowLeft,
            contentDescription = "BackArrowIcon",
            modifier = Modifier.size(30.sdp)
        )
        Icon(
            painter = painterResource(id = R.drawable.sea_title_icon),
            contentDescription = "TitleIcon",
            modifier = Modifier.size(80.sdp),
            tint = Blue,
        )
        Icon(
            painter = painterResource(id = R.drawable.notification_icon),
            contentDescription = "NotificationIcon",
            modifier = Modifier.size(30.sdp),
            tint = Orange,

            )
    }
}

@Composable
fun SlideShowWallPaper() {
    Box(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(id = R.drawable.aquarium_wallpaper2),
            contentDescription = "Aquarium Wallpaper",
            modifier = Modifier
                .fillMaxWidth()
                .height(150.sdp),
            contentScale = ContentScale.FillBounds

        )
        Text(
            "Don't miss our \ndaily Dive Feeding!",
            fontSize = 18.ssp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 8.sdp, top = 32.sdp)
        )
    }
}

@Composable
fun NavigationIconLayout() {
    Column(Modifier.padding(top = 32.sdp)) {
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Icon(
                painter = painterResource(id = R.drawable.map_icon),
                contentDescription = "MapIcon",
                Modifier
                    .size(25.sdp)
                    .drawBehind { drawCircle(Grey, 80F) },
                tint = Gold,
            )
            Icon(
                painter = painterResource(id = R.drawable.inhabitants_icon),
                contentDescription = "InhabitantsIcon",
                Modifier
                    .size(25.sdp)
                    .drawBehind { drawCircle(Grey, 80F) },
                tint = Gold,
            )
            Icon(
                painter = painterResource(id = R.drawable.shows_icon),
                contentDescription = "ShowsIcon",
                Modifier
                    .size(25.sdp)
                    .drawBehind { drawCircle(Grey, 80F) },
                tint = Gold,
            )
            Icon(
                painter = painterResource(id = R.drawable.shopping_icon),
                contentDescription = "ShoppingIcon",
                Modifier
                    .size(25.sdp)
                    .drawBehind { drawCircle(Grey, 80F) },
                tint = Gold,
            )
        }
        Spacer(modifier = Modifier.height(32.sdp))
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Icon(
                painter = painterResource(id = R.drawable.dine_icon),
                contentDescription = "DineIcon",
                Modifier
                    .size(25.sdp)
                    .drawBehind { drawCircle(Grey, 80F) },
                tint = Gold,
            )
            Icon(
                painter = painterResource(id = R.drawable.meet_greet_icon),
                contentDescription = "MeetGreetIcon",
                Modifier
                    .size(25.sdp)
                    .drawBehind { drawCircle(Grey, 80F) },
                tint = Gold,
            )
            //just a placeholder for placing techniques
            Icon(
                painter = painterResource(id = R.drawable.shows_icon),
                contentDescription = "ShowsIcon",
                Modifier
                    .alpha(0F)
                    .size(25.sdp)
                    .drawBehind { drawCircle(Grey, 80F) },
                tint = Gold,
            )
            Icon(
                painter = painterResource(id = R.drawable.shopping_icon),
                contentDescription = "ShoppingIcon",
                Modifier
                    .alpha(0F)
                    .size(25.sdp)
                    .drawBehind { drawCircle(Grey, 80F) },
                tint = Gold,
            )
        }
    }
}

@Composable
fun TicketsCardLayout() {
    Row(
        Modifier.fillMaxWidth(),
    ) {
        CardLayout(
            "My e-tickets", "There aren't\nany yet.", "Retrieve here", R.drawable.eticket_icon,
            LightGrey
        )
        CardLayout(
            "Park hours", "Today, 13 Feb\n10am - 5pm", "Plan my visit", R.drawable.park_hour_icon,
            Color.Black
        )
    }
}

@Composable
fun CardLayout(
    titleText: String,
    messageText: String,
    buttonText: String,
    icon: Int,
    textColor: Color
) {
    Card(
        modifier = Modifier
            .padding(top = 32.sdp, start = 16.sdp, bottom = 32.sdp)
            .width(130.sdp),
        colors = CardDefaults.cardColors(
            containerColor = Color.White,
        ),
        shape = RoundedCornerShape(20.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        )
    ) {
        Column {
            Row(
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.sdp, vertical = 8.sdp)
            ) {
                Text(text = titleText, Modifier.weight(1F))
                Icon(
                    painter = painterResource(id = icon),
                    contentDescription = "ETicketsIcon",
                    modifier = Modifier
                        .size(25.sdp), tint = Gold
                )

            }
            Text(
                text = messageText,
                fontSize = 15.ssp,
                color = textColor,
                modifier = Modifier.padding(horizontal = 16.sdp)
            )
            TextButton(
                onClick = {},
                modifier = Modifier.padding(horizontal = 8.sdp)
            ) {
                Text(
                    buttonText,
                    color = Pink,
                )
            }
        }
    }
}

@Composable
fun UpcomingShowLayout() {
    Column(Modifier.padding(horizontal = 16.sdp)) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Text(
                "Upcoming Shows",
                fontSize = 16.ssp,
                color = Color.Black,
                modifier = Modifier.weight(1F)
            )
            TextButton(onClick = {}) {
                Text(text = "View all", color = Pink, fontSize = 14.ssp)
            }
        }
        ShowsList()
    }
}

@Composable
fun ShowsList() {
    val list = arrayListOf<ShowsModel>(
        ShowsModel(
            "Dive Feeding @ Shipwreck",
            Alignment.BottomCenter,
            R.drawable.aquarium_wallpaper2
        ),
        ShowsModel(
            "Say Cheese\nShark",
            Alignment.CenterStart,
            R.drawable.schesseshark
        )
    )
    LazyRow() {
        items(list) {
            ShowsListItem(it)
            Spacer(modifier = Modifier.width(8.sdp))
        }
    }
}

@Composable
fun ShowsListItem(showsModel: ShowsModel) {
    Box {
        Image(
            painter = painterResource(id = showsModel.image),
            contentDescription = "DiveFeedingImage",
            modifier = Modifier
                .height(150.sdp)
                .width(200.sdp)
                .clip(RoundedCornerShape(10.sdp)),
            contentScale = ContentScale.FillBounds
        )
        Text(
            showsModel.title,
            fontSize = 14.ssp,
            color = Color.White,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .align(showsModel.alignment)
                .padding(
                    start = 8.sdp,
                    bottom = if (showsModel.alignment == Alignment.BottomCenter) 16.sdp else 0.sdp
                )
        )
    }
}

@Composable
fun BottomNavigationViewLayout() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 16.sdp, bottom = 16.sdp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BottomNavigationItem(R.drawable.home_icon, "Home", "HomeIcon", true)
        BottomNavigationItem(R.drawable.baseline_wallet_24, "Wallet", "WalletIcon")
        BottomNavigationItem(R.drawable.more_icon, "More", "MoreIcon")
    }
}

@Composable
fun BottomNavigationItem(
    icon: Int,
    titleText: String,
    contentDescription: String,
    tint: Boolean = false,
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = contentDescription,
            Modifier.size(25.sdp),
            tint = if (tint) Color.Red else Color.Black
        )
        Text(text = titleText, fontSize = 11.ssp, color = Color.Black, textAlign = TextAlign.Center)
    }
}