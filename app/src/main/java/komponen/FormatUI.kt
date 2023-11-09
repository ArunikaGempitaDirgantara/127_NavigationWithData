package komponen

import android.R.string
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.esteh.R

@Composable
fun FormatLabelHarga(subtotal: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.subtotal_price, subtotal),
        modifier = Modifier,
        style = MaterialTheme.typography.headlineSmall
    )
}