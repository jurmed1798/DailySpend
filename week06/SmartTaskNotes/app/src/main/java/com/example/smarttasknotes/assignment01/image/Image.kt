package com.example.smarttasknotes.assignment01.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.smarttasknotes.R
@Composable
fun Image(
    arms: Boolean,
    eyebrows: Boolean,
    glasses: Boolean,
    mouth: Boolean,
    nose: Boolean,
    ears: Boolean,
    eyes: Boolean,
    hat: Boolean,
    mustache: Boolean,
    shoes: Boolean
) {
    Box(
        modifier = Modifier.size(200.dp),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.body),
            contentDescription = "body",
            modifier = Modifier.size(220.dp)
        )

        if (arms) {
            Image(
                painter = painterResource(id = R.drawable.arms),
                contentDescription = "arms",
                modifier = Modifier.size(220.dp)
            )
        }

        if (eyebrows) {
            Image(
                painter = painterResource(id = R.drawable.eyebrows),
                contentDescription = "eyebrows",
                modifier = Modifier.size(220.dp)
            )
        }

        if (glasses) {
            Image(
                painter = painterResource(id = R.drawable.glasses),
                contentDescription = "glasses",
                modifier = Modifier.size(220.dp)
            )
        }

        if (mouth) {
            Image(
                painter = painterResource(id = R.drawable.mouth),
                contentDescription = "mouth",
                modifier = Modifier.size(220.dp)
            )
        }

        if (nose) {
            Image(
                painter = painterResource(id = R.drawable.nose),
                contentDescription = "nose",
                modifier = Modifier.size(220.dp)
            )
        }

        if (ears) {
            Image(
                painter = painterResource(id = R.drawable.ears),
                contentDescription = "ears",
                modifier = Modifier.size(220.dp)
            )
        }

        if (eyes) {
            Image(
                painter = painterResource(id = R.drawable.eyes),
                contentDescription = "eyes",
                modifier = Modifier.size(220.dp)
            )
        }

        if (hat) {
            Image(
                painter = painterResource(id = R.drawable.hat),
                contentDescription = "hat",
                modifier = Modifier.size(220.dp)
            )
        }

        if (mustache) {
            Image(
                painter = painterResource(id = R.drawable.mustache),
                contentDescription = "mustache",
                modifier = Modifier.size(220.dp)
            )
        }

        if (shoes) {
            Image(
                painter = painterResource(id = R.drawable.shoes),
                contentDescription = "shoes",
                modifier = Modifier.size(220.dp)
            )
        }
    }
}