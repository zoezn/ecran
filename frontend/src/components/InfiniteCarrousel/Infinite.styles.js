import styled from "styled-components";

export const Container = styled.div`
	margin-top: 20px;
	@-webkit-keyframes scroll {
		0% {
			-webkit-transform: translateX(0);
			transform: translateX(0);
		}
		100% {
			-webkit-transform: translateX(calc(-250px * 8));
			transform: translateX(calc(-250px * 8));
		}
	}

	@keyframes scroll {
		0% {
			-webkit-transform: translateX(0);
			transform: translateX(0);
		}
		100% {
			-webkit-transform: translateX(calc(-250px * 8));
			transform: translateX(calc(-250px * 8));
		}
	}
	.slider {
		background: #0f172a;
		/*box-shadow: 0 10px 20px -5px rgba(0, 0, 0, .125);*/
		height: 150px;
		margin: auto;
		overflow: hidden;
		position: relative;
		width: 95%;
	}

	.slider::before,
	.slider::after {
		background: linear-gradient(90deg, rgba(15, 23, 42, 1) 40%, rgba(0, 0, 0, 0));
		content: "";
		height: 200px;
		position: absolute;
		width: 200px;
		z-index: 2;
	}
	.slider::after {
		right: 0;
		top: 0;
		-webkit-transform: rotateZ(180deg);
		transform: rotateZ(180deg);
	}
	.slider::before {
		left: 0;
		top: 0;
	}
	.slider .slide-track {
		-webkit-animation: scroll 40s linear infinite;
		animation: scroll 40s linear infinite;
		display: flex;
		width: calc(250px * 16);
	}
	.slider .slide {
		width: 250px;
		display: flex;
		align-items: center;
		justify-content: center;
	}

	.slide img {
		width: 100px;
		margin: auto;
	}
`;
