package com.example.smarttasknotes.assignment01.screen


import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.smarttasknotes.assignment01.Check.CheckItem
import com.example.smarttasknotes.assignment01.image.Image

@Composable
fun HomeScreen() {

    var arms by rememberSaveable { mutableStateOf(false) }
    var eyebrows by rememberSaveable { mutableStateOf(false) }
    var glasses by rememberSaveable { mutableStateOf(false) }
    var mouth by rememberSaveable { mutableStateOf(false) }
    var nose by rememberSaveable { mutableStateOf(false) }
    var ears by rememberSaveable { mutableStateOf(false) }
    var eyes by rememberSaveable { mutableStateOf(false) }
    var hat by rememberSaveable { mutableStateOf(false) }
    var mustache by rememberSaveable { mutableStateOf(false) }
    var shoes by rememberSaveable { mutableStateOf(false) }

    val orientation = LocalConfiguration.current.orientation

    Column(
        modifier = Modifier
            .padding(20.dp)
    ) {

        Text(text = "202413547 줄메드")

        Spacer(modifier = Modifier.height(50.dp))

        if (orientation == Configuration.ORIENTATION_PORTRAIT) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    arms = arms,
                    eyebrows = eyebrows,
                    glasses = glasses,
                    mouth = mouth,
                    nose = nose,
                    ears = ears,
                    eyes = eyes,
                    hat = hat,
                    mustache = mustache,
                    shoes = shoes,
                )
                Spacer(modifier = Modifier.height(80.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Column {
                        CheckItem("arms", arms) { arms = it }
                        CheckItem("eyebrows", eyebrows) { eyebrows = it }
                        CheckItem("glasses", glasses) { glasses = it }
                        CheckItem("mouth", mouth) { mouth = it }
                        CheckItem("nose", nose) { nose = it }
                    }

                    Column {
                        CheckItem("ears", ears) { ears = it }
                        CheckItem("eyes", eyes) { eyes = it }
                        CheckItem("hat", hat) { hat = it }
                        CheckItem("mustache", mustache) { mustache = it }
                        CheckItem("shoes", shoes) { shoes = it }
                    }
                }
            }

        } else {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(20.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(
                    arms = arms,
                    eyebrows = eyebrows,
                    glasses = glasses,
                    mouth = mouth,
                    nose = nose,
                    ears = ears,
                    eyes = eyes,
                    hat = hat,
                    mustache = mustache,
                    shoes = shoes
                )

                Spacer(modifier = Modifier.width(20.dp))

                Row {
                    Column {
                        CheckItem("arms", arms) { arms = it }
                        CheckItem("eyebrows", eyebrows) { eyebrows = it }
                        CheckItem("glasses", glasses) { glasses = it }
                        CheckItem("mouth", mouth) { mouth = it }
                        CheckItem("nose", nose) { nose = it }
                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Column {
                        CheckItem("ears", ears) { ears = it }
                        CheckItem("eyes", eyes) { eyes = it }
                        CheckItem("hat", hat) { hat = it }
                        CheckItem("mustache", mustache) { mustache = it }
                        CheckItem("shoes", shoes) { shoes = it }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}