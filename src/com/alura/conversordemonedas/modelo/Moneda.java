package com.alura.conversordemonedas.modelo;

public record Moneda(String base_code,
                     String target_code,
                     double conversion_rate,
                     String time_last_update_utc) {
}
