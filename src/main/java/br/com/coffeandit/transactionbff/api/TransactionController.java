package br.com.coffeandit.transactionbff.api;

import br.com.coffeandit.transactionbff.dto.RequestTransactionDTO;
import br.com.coffeandit.transactionbff.dto.TransactioDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/transaction")
public class TransactionController {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactioDTO> enviarTrasacao(@RequestBody final RequestTransactionDTO requestTransactionDTO){
        return Mono.empty();
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactioDTO> buscarTransacao(@PathVariable("id") final String uuid){
        return Mono.empty();
    }

    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactioDTO> removerTransacao(@PathVariable("id") final String uuid){
        return Mono.empty();
    }

    @PatchMapping(value = "/{id}/confirmar", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Mono<TransactioDTO> confirmarTransacao(@PathVariable("id") final String uuid){
        return Mono.empty();
    }
}
