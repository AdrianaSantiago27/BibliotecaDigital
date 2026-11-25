package com.bajsn.biblioteca1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.bajsn.biblioteca1.ui.theme.Biblioteca1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Biblioteca1Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BaseResourcesPreview()
                }
            }
        }
    }
}

@Composable
private fun BaseResourcesPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo_biblioteca),
            contentDescription = stringResource(id = R.string.cd_app_logo),
            modifier = Modifier.size(96.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = stringResource(id = R.string.app_name),
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = stringResource(id = R.string.version_label),
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_libro),
                contentDescription = stringResource(id = R.string.cd_icono_biblioteca),
                modifier = Modifier.size(24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_favorito),
                contentDescription = stringResource(id = R.string.cd_icono_favorito),
                modifier = Modifier.size(24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_buscar),
                contentDescription = stringResource(id = R.string.cd_icono_buscar),
                modifier = Modifier.size(24.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.ic_usuario),
                contentDescription = stringResource(id = R.string.cd_icono_usuario),
                modifier = Modifier.size(24.dp)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.portada_ejemplo_1),
                contentDescription = stringResource(id = R.string.cd_portada_ejemplo),
                modifier = Modifier.width(64.dp).height(88.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.portada_ejemplo_2),
                contentDescription = stringResource(id = R.string.cd_portada_ejemplo),
                modifier = Modifier.width(64.dp).height(88.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.portada_ejemplo_3),
                contentDescription = stringResource(id = R.string.cd_portada_ejemplo),
                modifier = Modifier.width(64.dp).height(88.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.portada_ejemplo_4),
                contentDescription = stringResource(id = R.string.cd_portada_ejemplo),
                modifier = Modifier.width(64.dp).height(88.dp)
            )
        }
    }
}
