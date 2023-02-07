package med.voll.api.paciente;

import med.voll.api.endereco.Endereco;

public record DadosCadastroPaciente(String nome,
        String email,
        String telefone,
        String cpf,
        Endereco endereco) {

}
