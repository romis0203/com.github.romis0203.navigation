package com.git.romis0203.navigation.screen.screens

@Composable
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFED145B))
            .padding(32.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "LOGIN",
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Button(onClick = { TODO() }) {
            Text(text = "ENTRAR", color = Color.Blue)
        }
    }
}