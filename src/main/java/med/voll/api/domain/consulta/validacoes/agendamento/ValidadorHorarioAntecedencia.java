package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;


@Component
public class ValidadorHorarioAntecedencia implements ValidadorAgendamentoConsulta {

    public void validar(DadosAgendamentoConsulta dados) throws ValidacaoException {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaDaClinica = dataConsulta.getHour() < 7;
        var depoisEncerramentoDaClinica = dataConsulta.getHour() > 18;

        if(domingo || antesDaAberturaDaClinica || depoisEncerramentoDaClinica) {
            throw new ValidacaoException("Consulta fora do horário de funcionamento!!");
        }



    }


}
