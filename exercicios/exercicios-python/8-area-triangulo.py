
# Solicitando a entrada de dados como 'float'
base = float(input("Digite o valor da base do triângulo: "))
altura = float(input("Digite o valor da altura do triângulo: "))

# Verificando o tipo de dados
print(f"Tipo de dado: {type(base)} e {type(altura)}")

#
area = ((base * altura) / 2)
print(f"Área do triângulo: {area:.2f}")
