package ru.mrmarvel.couponapp.ui

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ru.mrmarvel.couponapp.R
import ru.mrmarvel.couponapp.data.CouponCategory
import ru.mrmarvel.couponapp.data.DataProvider

@Preview
@Composable
fun HotSection(onCouponCategoryClick: ((CouponCategory) -> Unit)? = null) {
    val couponCategories = DataProvider.couponCategoryList
    Surface(Modifier.fillMaxWidth()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = "Популярно",
                fontSize = MaterialTheme.typography.displayMedium.fontSize,
                fontStyle = MaterialTheme.typography.displayMedium.fontStyle)
            Box(
                Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .background(colorResource(id = R.color.orange))
            ) {
                LazyRow(
                    Modifier.size(height = 280.dp, width = Dp.Unspecified),
                    contentPadding = PaddingValues(horizontal = 6.dp, vertical = 8.dp)) {
                    items(count=couponCategories.size, itemContent = { i ->
                        HotCouponCategoryListItem(
                            Modifier
                                .padding(end=12.dp)
                                .clickable { onCouponCategoryClick?.invoke(couponCategories[i]) },
                            couponCategory = couponCategories[i])
                    })
                }
            }
        }
    }
}