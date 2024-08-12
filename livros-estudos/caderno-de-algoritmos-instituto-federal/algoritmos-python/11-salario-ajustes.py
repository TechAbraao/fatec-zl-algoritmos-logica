# Entrada de dados
horasTrabalhadas = float(input("Digite o total de horas trabalhadas no mês: "))
valorHora = float(input("Digite o valor de hora trabalhada: "))
porcentualDesconto = float(input("Digite o porcentual de desconto "))
# Principais calculos
salarioBruto = (horasTrabalhadas * valorHora)
totalDesconto = ((porcentualDesconto / 100) * salarioBruto)
salarioLiquido = (salarioBruto - totalDesconto)
#
print(f"Horas trabalhadas no mês: {horasTrabalhadas} horas\nSalário bruto: R$ {salarioBruto}")
print(f"Total de desconto: R$ {totalDesconto}\nSalário líquido: R$ {salarioLiquido}")
#
