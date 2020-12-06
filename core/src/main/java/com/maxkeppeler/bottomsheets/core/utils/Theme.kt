/*
 * Designed and developed by Aidan Follestad (@afollestad)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.maxkeppeler.bottomsheets.core.utils

import android.content.Context
import androidx.annotation.StyleRes
import com.maxkeppeler.bottomsheets.R
import android.R.attr as androidAttr

internal enum class Theme(@StyleRes val styleRes: Int) {

    DAY(R.style.BottomSheet_Base_Light),
    NIGHT(R.style.BottomSheet_Base_Dark);

    companion object {
        fun inferTheme(ctx: Context): Theme {
            val isPrimaryDark = colorOfAttr(ctx, androidAttr.textColorPrimary).isColorDark()
            return if (isPrimaryDark) DAY else NIGHT
        }
    }
}