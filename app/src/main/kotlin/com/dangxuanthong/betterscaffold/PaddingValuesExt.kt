package com.dangxuanthong.betterscaffold

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.LayoutDirection

val layoutDirection: LayoutDirection
    @Composable
    @ReadOnlyComposable
    get() = LocalLayoutDirection.current

val PaddingValues.start: Dp
    @Composable
    @ReadOnlyComposable
    get() = calculateStartPadding(layoutDirection)

val PaddingValues.top: Dp
    @Composable
    @ReadOnlyComposable
    get() = calculateTopPadding()

val PaddingValues.bottom: Dp
    @Composable
    @ReadOnlyComposable
    get() = calculateBottomPadding()

val PaddingValues.end: Dp
    @Composable
    @ReadOnlyComposable
    get() = calculateEndPadding(layoutDirection)

@Composable
@ReadOnlyComposable
fun PaddingValues.copy(
    start: Dp = this.start,
    top: Dp = this.top,
    end: Dp = this.end,
    bottom: Dp = this.bottom
) = PaddingValues(start, top, end, bottom)
