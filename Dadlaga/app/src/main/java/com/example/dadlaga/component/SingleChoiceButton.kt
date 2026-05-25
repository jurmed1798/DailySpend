package com.example.dadlaga.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.SingleChoiceSegmentedButtonRowScope
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dadlaga.utility.HomeTab

@Composable
fun SingleChoiceButton(
    selectedHomeTab: HomeTab,
    onSelectedChange: (HomeTab)-> Unit,
    modifier: Modifier= Modifier
){
    val options =listOf(HomeTab.TASK,HomeTab.NOTE)
    SingleChoiceSegmentedButtonRow(

        modifier=modifier.fillMaxWidth().padding(top=16.dp)
    ){
        //жагсаалтыг давтах болно. index=дугаар(0,1,2,...) itemType=утга нь
        //Жишээ нь: index=0, itemType=HomeTab.TASK → index=1, itemType=HomeTab.NOTE
        options.forEachIndexed{index,itemType->
            SegmentedButton(
                shape= SegmentedButtonDefaults.itemShape(
                    index=index,
                    count=options.size
                ),
                onClick={
                    onSelectedChange(itemType)
                },
                selected=selectedHomeTab== itemType,
                label={
                    Text(
                        text= when (itemType){
                            HomeTab.TASK->"Task"
                            HomeTab.NOTE->"Note"
                        }
                    )
                }
            )
        }

    }
}
@Composable
@Preview
fun PreviewSingleButtonChoice(){
    var selectedHomeTab: HomeTab by remember{mutableStateOf(HomeTab.TASK)}
    SingleChoiceButton(selectedHomeTab=selectedHomeTab,
        onSelectedChange={selectedHomeTab=it})
}