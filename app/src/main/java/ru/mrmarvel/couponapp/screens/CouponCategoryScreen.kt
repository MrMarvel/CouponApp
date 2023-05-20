package ru.mrmarvel.couponapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ru.mrmarvel.couponapp.data.CouponCategory
import ru.mrmarvel.couponapp.data.DataProvider
import ru.mrmarvel.couponapp.ui.HotCouponCategoryListItem
import ru.mrmarvel.couponapp.viewmodels.SharedViewModel

@Composable
fun CouponCategoryScreen(couponCategory: CouponCategory,
                         sharedViewModel: SharedViewModel) {
    Surface(
        Modifier.fillMaxSize()
    ) {
        Column (Modifier.fillMaxSize()) {
            HotCouponCategoryListItem(
                Modifier
                    .weight(1f),
                couponCategory = couponCategory)
            Row (
                modifier=Modifier
                    .weight(2f)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                FilledTonalButton(
                    onClick = {}
                ) {
                    Text("Купить")
                }
            }
        }


    }
}

@Preview
@Composable
fun CouponCategoryScreenPreview() {
    CouponCategoryScreen(DataProvider.couponCategory, SharedViewModel())
}