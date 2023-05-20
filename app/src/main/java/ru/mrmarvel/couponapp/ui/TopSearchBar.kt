package ru.mrmarvel.couponapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.mrmarvel.couponapp.R
import ru.mrmarvel.couponapp.data.User

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchBar() {
    var text by remember { mutableStateOf(TextFieldValue("")) }
    Surface(
        modifier = Modifier
            .padding(all = 8.dp)
            .shadow(
                elevation = 6.dp,
                ambientColor = MaterialTheme.colorScheme.secondary,
                shape = RoundedCornerShape(120.dp)
            )
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal =8.dp, vertical = 4.dp),
            verticalAlignment =  Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.search_icon),
                contentDescription = "Search bar icon",
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            Column{
                TextField(
                    modifier = Modifier
                        .padding(end = 8.dp)
                        .defaultMinSize(minWidth = 1.dp, minHeight = 1.dp)
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    value = text,
                    onValueChange = {text = it},
                    placeholder = { Text("Найти купон...") }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SearchBarPreview() {
    SearchBar()
}
@Composable
fun UserAvatar(modifier: Modifier = Modifier, user: User) {
    Surface(modifier.padding(8.dp)) {
        Image(
            modifier = Modifier
                .clip(CircleShape)
                .border(2.dp, Color.Black, CircleShape)
                .requiredSize(48.dp),
            painter = painterResource(id = R.drawable.avatar_default),
            contentDescription = "Avatar image",
            contentScale = ContentScale.Crop,
        )
    }
}


@Preview(showBackground = true)
@Composable
fun AvatarPreview() {
    UserAvatar(user=User(1,""))
}

@Preview
@Composable
fun TopSearchBar() {
    Surface(modifier = Modifier.fillMaxWidth()) {
        Row(horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically) {
            Box(Modifier.weight(1f)) {
                SearchBar()
            }
            UserAvatar(user=User(1,""))
        }
    }
}
