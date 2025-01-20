package med.voll.api.pacientes;

import med.voll.api.endereco.Endereco;

public record DadosDetalhadoPaciente(Long id, String nome, String email, String telefone, String cpf, Endereco endereco) {
    public DadosDetalhadoPaciente(Paciente paciente) {
        this(
                paciente.getId(),
                paciente.getNome(),
                paciente.getEmail(),
                paciente.getTelefone(),
                paciente.getTelefone(),
                paciente.getEndereco()
        );
    }
}
