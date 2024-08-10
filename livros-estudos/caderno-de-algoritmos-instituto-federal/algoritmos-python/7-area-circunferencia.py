#
import math

raio = input("Digite o valor do raio: ")

# Convertendo a variável 'raio' para o tipo 'float'
float_raio = float(raio)
print(f"Valor do raio digitado: {float_raio}")

# Cálculo da área
area = math.pi * math.pow(float_raio, 2)
print(f"Área da circunferência: {area:.2f}")
