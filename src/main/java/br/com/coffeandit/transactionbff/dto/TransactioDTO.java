package br.com.coffeandit.transactionbff.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "uuid")
public class TransactioDTO {

    private UUID uuid;
}
