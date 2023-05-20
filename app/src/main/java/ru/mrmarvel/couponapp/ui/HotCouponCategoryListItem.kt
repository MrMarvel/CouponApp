package ru.mrmarvel.couponapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.mrmarvel.couponapp.R
import ru.mrmarvel.couponapp.data.models.CouponCategory
import ru.mrmarvel.couponapp.data.DataProvider
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

@Composable
fun HotCouponCategoryListItem(
    modifier: Modifier = Modifier,
    couponCategory: CouponCategory
) {
    Surface (
        modifier
            .clip(RoundedCornerShape(5.dp))
    ) {
        Column (
            Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .background(MaterialTheme.colorScheme.background)
                .padding(4.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Box(modifier = Modifier.weight(2f)) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(text=couponCategory.shopName,
                        fontSize = MaterialTheme.typography.displaySmall.fontSize
                    )
                    Image(
                        modifier = Modifier
                            .sizeIn(Dp.Unspecified, Dp.Unspecified, 256.dp, 256.dp)
                            .aspectRatio(1f)
                            .clip(CircleShape)
                            .border(2.dp, Color.Black, CircleShape),
                        painter = painterResource(id = R.drawable.sanders),
                        contentScale = ContentScale.Crop,
                        contentDescription = "coupon image"
                    )
                }
            }
            Box(modifier = Modifier.weight(1f)) {
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    Text(
                        text = couponCategory.shortName,
                        fontSize = MaterialTheme.typography.titleLarge.fontSize
                    )
                    if (couponCategory.best_expire_date != null) {
                        val today = Calendar.getInstance()
                        val dateFormatter = SimpleDateFormat("dd.MM.yyyy",Locale.getDefault())
                        Text(
                            text = "До ${dateFormatter.format(couponCategory.best_expire_date)}",
                            fontSize = MaterialTheme.typography.bodyLarge.fontSize
                        )
                    }
                }
            }

        }
    }
}

@Preview
@Composable
fun HotCouponCategoryListItemPreview() {
    val couponCategory: CouponCategory = remember {DataProvider.couponCategory}
    HotCouponCategoryListItem(
        modifier = Modifier,
        couponCategory = couponCategory)
}