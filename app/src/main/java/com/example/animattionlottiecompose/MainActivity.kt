package com.example.animattionlottiecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.animattionlottiecompose.ui.theme.AnimattionLottieComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AnimattionLottieComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background
                ) {
                    showOne()
                }
            }
        }
    }


    @Composable
    fun showOne(){
        Box(
            contentAlignment = Alignment.Center
        ) {
            val composition by rememberLottieComposition(
                spec = LottieCompositionSpec.RawRes(
                    R.raw.wron2
                )
            )
            LottieAnimation(
                composition = composition, iterations = Int.MAX_VALUE
            )
        }
    }

    @Composable
    private fun showLoadingAnimattion() {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(.25f)
            ) {
                Box(
                    modifier = Modifier
                        .weight(0.3f)
//                        .background(Red)
                ) {
                    val composition by rememberLottieComposition(
                        spec = LottieCompositionSpec.RawRes(
                            R.raw.loading1
                        )
                    )
                    LottieAnimation(
                        composition = composition, iterations = Int.MAX_VALUE
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(0.3f)
//                        .background(Green)
                ) {
                    val composition by rememberLottieComposition(
                        spec = LottieCompositionSpec.RawRes(
                            R.raw.loading2
                        )
                    )
                    LottieAnimation(
                        composition = composition, iterations = Int.MAX_VALUE
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(0.3f)
//                        .background(Cyan)
                ) {
                    val composition by rememberLottieComposition(
                        spec = LottieCompositionSpec.RawRes(
                            R.raw.loading3
                        )
                    )
                    LottieAnimation(
                        composition = composition, iterations = Int.MAX_VALUE
                    )
                }

            }

            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(0.25f)
            ) {
                Box(
                    modifier = Modifier
                        .weight(0.5f)
//                        .background(Red)
                ) {
                    val composition by rememberLottieComposition(
                        spec = LottieCompositionSpec.RawRes(
                            R.raw.win1
                        )
                    )
                    LottieAnimation(
                        composition = composition, iterations = Int.MAX_VALUE
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(0.5f)
//                        .background(Green)
                ) {
                    val composition by rememberLottieComposition(
                        spec = LottieCompositionSpec.RawRes(
                            R.raw.win2
                        )
                    )
                    LottieAnimation(
                        composition = composition, iterations = Int.MAX_VALUE
                    )
                }
            }

            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(0.25f)
            ) {
                Box(
                    modifier = Modifier
                        .weight(0.3f)
//                        .background(Red)
                ) {
                    val composition by rememberLottieComposition(
                        spec = LottieCompositionSpec.RawRes(
                            R.raw.correct1
                        )
                    )
                    LottieAnimation(
                        composition = composition, iterations = Int.MAX_VALUE
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(0.3f)
//                        .background(Green)
                ) {
                    val composition by rememberLottieComposition(
                        spec = LottieCompositionSpec.RawRes(
                            R.raw.correct2
                        )
                    )
                    LottieAnimation(
                        composition = composition, iterations = Int.MAX_VALUE
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(0.3f)
//                        .background(Green)
                ) {
                    val composition by rememberLottieComposition(
                        spec = LottieCompositionSpec.RawRes(
                            R.raw.correct3
                        )
                    )
                    LottieAnimation(
                        composition = composition, iterations = Int.MAX_VALUE
                    )
                }
            }

            Row(
                Modifier
                    .fillMaxWidth()
                    .weight(0.25f)
            ) {
                Box(
                    modifier = Modifier
                        .weight(0.3f)
//                        .background(Red)
                ) {
                    val composition by rememberLottieComposition(
                        spec = LottieCompositionSpec.RawRes(
                            R.raw.wron2
                        )
                    )
                    LottieAnimation(
                        composition = composition, iterations = Int.MAX_VALUE
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(0.3f)
//                        .background(Green)
                ) {
                    val composition by rememberLottieComposition(
                        spec = LottieCompositionSpec.RawRes(
                            R.raw.wrong1
                        )
                    )
                    LottieAnimation(
                        composition = composition, iterations = Int.MAX_VALUE
                    )
                }

                Box(
                    modifier = Modifier
                        .weight(0.3f)
//                        .background(Green)
                ) {
                    val composition by rememberLottieComposition(
                        spec = LottieCompositionSpec.RawRes(
                            R.raw.wrong3
                        )
                    )
                    LottieAnimation(
                        composition = composition, iterations = Int.MAX_VALUE
                    )
                }
            }
        }
    }
}
