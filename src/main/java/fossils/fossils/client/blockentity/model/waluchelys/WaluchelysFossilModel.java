package fossils.fossils.client.blockentity.model.waluchelys;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class WaluchelysFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Waluchelys;
	private final ModelPart frontleftleg4;
	private final ModelPart frontleftleg5;
	private final ModelPart frontleftleg6;
	private final ModelPart frontrightleg4;
	private final ModelPart frontrightleg5;
	private final ModelPart frontrightleg6;
	private final ModelPart chest;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lowerjaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart leftCarapace;
	private final ModelPart rightCarapace;

	public WaluchelysFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Waluchelys = this.fossil.getChild("Waluchelys");
		this.frontleftleg4 = this.Waluchelys.getChild("frontleftleg4");
		this.frontleftleg5 = this.frontleftleg4.getChild("frontleftleg5");
		this.frontleftleg6 = this.frontleftleg5.getChild("frontleftleg6");
		this.frontrightleg4 = this.Waluchelys.getChild("frontrightleg4");
		this.frontrightleg5 = this.frontrightleg4.getChild("frontrightleg5");
		this.frontrightleg6 = this.frontrightleg5.getChild("frontrightleg6");
		this.chest = this.Waluchelys.getChild("chest");
		this.frontleftleg = this.chest.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontrightleg = this.chest.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.tail = this.Waluchelys.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.leftCarapace = this.Waluchelys.getChild("leftCarapace");
		this.rightCarapace = this.Waluchelys.getChild("rightCarapace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Waluchelys = fossil.addOrReplaceChild("Waluchelys", CubeListBuilder.create().texOffs(0, 0).addBox(-1.5F, 0.1F, -3.0F, 2.0F, 1.0F, 9.0F, new CubeDeformation(0.009F)), PartPose.offset(0.5F, -3.5F, 0.0F));

		PartDefinition cube_r1 = Waluchelys.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(49, 53).addBox(-1.6939F, -6.5F, -3.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.6939F, 6.6F, 6.7391F, 0.0F, -0.0087F, 0.0F));

		PartDefinition cube_r2 = Waluchelys.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(36, 11).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1681F, -7.3787F, -0.1752F, 0.0859F, -0.0152F));

		PartDefinition cube_r3 = Waluchelys.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(17, 34).addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.5F, 0.075F, -6.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Waluchelys.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(36, 27).addBox(-2.0F, -0.05F, -3.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.3792F, -5.7642F, 0.2531F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Waluchelys.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 21).addBox(-2.0F, -0.05F, -5.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.5537F, -0.7673F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Waluchelys.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 34).addBox(-2.0F, 0.2F, -4.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -6.4766F, 3.2473F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r7 = Waluchelys.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 78).addBox(-0.5F, -0.8F, -1.4F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F))
				.texOffs(19, 20).addBox(-2.0F, -0.8F, -6.0F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.5F, -4.5F, 9.0F, -0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r8 = Waluchelys.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 53).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -4.7432F, 6.2069F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r9 = Waluchelys.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -5.3689F, 2.2562F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r10 = Waluchelys.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(19, 11).addBox(-0.5F, -1.5F, -13.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -3.65F, 8.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = Waluchelys.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5269F, -1.5351F, 6.5961F, -0.1393F, 0.5593F, -0.4058F));

		PartDefinition cube_r11 = frontleftleg4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(14, 65).addBox(4.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F))
				.texOffs(62, 0).addBox(1.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(64, 63).addBox(0.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.8867F, 0.8825F, 0.0F, 0.0372F, 0.0661F, 0.6125F));

		PartDefinition cube_r12 = frontleftleg4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(78, 40).addBox(-0.475F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(37, 78).addBox(-0.4F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2839F, 2.7366F, -0.8303F, 3.1003F, 0.4571F, -2.5497F));

		PartDefinition cube_r13 = frontleftleg4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(32, 78).addBox(-1.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 3.0881F, 0.8058F, -2.5701F));

		PartDefinition cube_r14 = frontleftleg4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 65).addBox(0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 0.0667F, 0.9814F, 0.6656F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.894F, 3.2572F, -0.554F, -0.3846F, -0.9308F, 0.2124F));

		PartDefinition cube_r15 = frontleftleg5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(61, 39).addBox(-1.95F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(23, 61).addBox(-2.05F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, 0.3007F, 1.6251F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6987F, 2.5754F, -0.5679F, 0.4947F, 0.451F, 0.4044F));

		PartDefinition cube_r16 = frontleftleg6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(48, 46).addBox(1.2743F, -1.4713F, -1.7024F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, 1.5708F));

		PartDefinition frontrightleg4 = Waluchelys.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5269F, -1.5351F, 6.5961F, 1.0965F, 0.6496F, 0.7623F));

		PartDefinition cube_r17 = frontrightleg4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(14, 65).mirror().addBox(-5.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(62, 0).mirror().addBox(-4.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(64, 63).mirror().addBox(-1.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.8867F, 0.8825F, 0.0F, 0.0372F, -0.0661F, -0.6125F));

		PartDefinition cube_r18 = frontrightleg4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(78, 40).mirror().addBox(-0.525F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(37, 78).mirror().addBox(-0.6F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2839F, 2.7366F, -0.8303F, 3.1003F, -0.4571F, 2.5497F));

		PartDefinition cube_r19 = frontrightleg4.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(32, 78).mirror().addBox(0.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 3.0881F, -0.8058F, 2.5701F));

		PartDefinition cube_r20 = frontrightleg4.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(7, 65).mirror().addBox(-1.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 0.0667F, -0.9814F, -0.6656F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.894F, 3.2572F, -0.554F, 0.2424F, -0.0892F, -0.1185F));

		PartDefinition cube_r21 = frontrightleg5.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(61, 39).mirror().addBox(-1.05F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(23, 61).mirror().addBox(-0.95F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, -0.3007F, -1.6251F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6987F, 2.5754F, -0.5679F, -0.3278F, -0.5374F, 0.0299F));

		PartDefinition cube_r22 = frontrightleg6.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(48, 46).mirror().addBox(-2.2743F, -1.4713F, -1.7024F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, -1.5708F));

		PartDefinition chest = Waluchelys.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(-0.5F, -5.1016F, -4.5428F));

		PartDefinition cube_r23 = chest.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(18, 53).addBox(0.0F, -0.9F, -2.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(22, 47).addBox(0.0F, -1.1F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 46).addBox(-0.5F, -0.1F, -2.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.384F, 0.0F, 0.0F));

		PartDefinition cube_r24 = chest.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(36, 32).mirror().addBox(-3.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3941F, -1.2794F, 0.1319F, 0.219F, -0.7289F));

		PartDefinition cube_r25 = chest.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(47, 39).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, 0.3941F, -1.2794F, 0.2373F, 0.0944F, -0.0776F));

		PartDefinition cube_r26 = chest.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(52, 44).mirror().addBox(-1.4963F, -0.0487F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.3F, 0.9941F, -3.1794F, 0.2373F, 0.0944F, -0.322F));

		PartDefinition cube_r27 = chest.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(75, 58).mirror().addBox(-0.4595F, 0.0923F, -1.2466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5844F, 3.041F, -0.2077F, -0.5114F, -0.1898F, -0.1805F));

		PartDefinition cube_r28 = chest.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(39, 62).mirror().addBox(-0.5F, -0.2F, -0.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.7895F, 4.6494F, -0.0579F, 1.5108F, 0.0185F, 0.37F));

		PartDefinition cube_r29 = chest.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(7, 73).mirror().addBox(-0.4595F, -0.6553F, -0.3691F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.6772F, 3.6333F, -0.5691F, 1.2028F, 0.0051F, 0.1522F));

		PartDefinition cube_r30 = chest.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 73).mirror().addBox(0.0152F, -2.5264F, -0.6274F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0103F, 2.611F, -0.7101F, 0.371F, 0.026F, 0.3935F));

		PartDefinition cube_r31 = chest.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(73, 41).mirror().addBox(-0.9902F, -0.7726F, -1.4616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6736F, 3.5607F, -2.92F, 1.329F, -0.0385F, -0.6329F));

		PartDefinition cube_r32 = chest.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(18, 57).mirror().addBox(-0.5783F, -4.5724F, -0.3099F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.6736F, 3.5607F, -2.92F, -0.2297F, 0.056F, -0.2516F));

		PartDefinition cube_r33 = chest.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(18, 57).addBox(-0.4217F, -4.5724F, -0.3099F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6736F, 3.5607F, -2.92F, -0.2297F, -0.056F, 0.2516F));

		PartDefinition cube_r34 = chest.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(73, 41).addBox(-0.0098F, -0.7726F, -1.4616F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.6736F, 3.5607F, -2.92F, 1.329F, 0.0385F, 0.6329F));

		PartDefinition cube_r35 = chest.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(12, 73).addBox(-1.0152F, -2.5264F, -0.6274F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0103F, 2.611F, -0.7101F, 0.371F, -0.026F, -0.3935F));

		PartDefinition cube_r36 = chest.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(7, 73).addBox(-0.5405F, -0.6553F, -0.3691F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6772F, 3.6333F, -0.5691F, 1.2028F, -0.0051F, -0.1522F));

		PartDefinition cube_r37 = chest.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(39, 62).addBox(-1.5F, -0.2F, -0.2F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7895F, 4.6494F, -0.0579F, 1.5108F, -0.0185F, -0.37F));

		PartDefinition cube_r38 = chest.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(75, 58).addBox(-0.5405F, 0.0923F, -1.2466F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5844F, 3.041F, -0.2077F, -0.5114F, 0.1898F, 0.1805F));

		PartDefinition cube_r39 = chest.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(52, 44).addBox(0.4963F, -0.0487F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.3F, 0.9941F, -3.1794F, 0.2373F, -0.0944F, 0.322F));

		PartDefinition cube_r40 = chest.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(47, 39).addBox(0.4963F, -0.0487F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3941F, -1.2794F, 0.2373F, -0.0944F, 0.0776F));

		PartDefinition cube_r41 = chest.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(45, 25).addBox(2.0418F, -2.5888F, -0.5365F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3941F, -1.2794F, -0.0201F, -0.2543F, 1.3568F));

		PartDefinition cube_r42 = chest.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(36, 32).addBox(1.1574F, -0.9495F, -0.5365F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.3941F, -1.2794F, 0.1319F, -0.219F, 0.7289F));

		PartDefinition frontleftleg = chest.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0269F, 3.5665F, -0.8612F, -0.4258F, 0.3593F, -0.3808F));

		PartDefinition cube_r43 = frontleftleg.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(46, 65).addBox(4.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F))
				.texOffs(62, 3).addBox(1.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F))
				.texOffs(65, 29).addBox(0.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(-0.8867F, 0.8825F, 0.0F, 0.0372F, 0.0661F, 0.6125F));

		PartDefinition cube_r44 = frontleftleg.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(15, 79).addBox(-0.475F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(78, 62).addBox(-0.4F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.2839F, 2.7366F, -0.8303F, 3.1003F, 0.4571F, -2.5497F));

		PartDefinition cube_r45 = frontleftleg.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(78, 43).addBox(-1.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 3.0881F, 0.8058F, -2.5701F));

		PartDefinition cube_r46 = frontleftleg.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(65, 33).addBox(0.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2001F, 0.5469F, -0.0796F, 0.0667F, 0.9814F, 0.6656F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9853F, 3.2963F, -0.5424F, -0.0559F, -0.551F, 0.3102F));

		PartDefinition cube_r47 = frontleftleg2.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(0, 61).addBox(-1.95F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(59, 60).addBox(-2.05F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, 0.3007F, 1.6251F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6987F, 2.5754F, -0.568F, 0.395F, 0.5138F, 0.1052F));

		PartDefinition cube_r48 = frontleftleg3.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(47, 32).addBox(1.25F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, 1.5708F));

		PartDefinition frontrightleg = chest.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0269F, 3.5665F, -0.8612F, 0.1658F, 0.2784F, 0.416F));

		PartDefinition cube_r49 = frontrightleg.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(46, 65).mirror().addBox(-5.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false)
				.texOffs(62, 3).mirror().addBox(-4.2F, -1.4F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.006F)).mirror(false)
				.texOffs(65, 29).mirror().addBox(-1.2F, -1.4F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(0.8867F, 0.8825F, 0.0F, 0.0372F, -0.0661F, -0.6125F));

		PartDefinition cube_r50 = frontrightleg.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(15, 79).mirror().addBox(-0.525F, -0.5F, -1.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(78, 62).mirror().addBox(-0.6F, -0.5F, -0.375F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.2839F, 2.7366F, -0.8303F, 3.1003F, -0.4571F, 2.5497F));

		PartDefinition cube_r51 = frontrightleg.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(78, 43).mirror().addBox(0.075F, -0.5F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 3.0881F, -0.8058F, 2.5701F));

		PartDefinition cube_r52 = frontrightleg.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(65, 33).mirror().addBox(-1.4F, -0.5F, -0.9F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2001F, 0.5469F, -0.0796F, 0.0667F, -0.9814F, -0.6656F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9853F, 3.2963F, -0.5424F, 0.2059F, 0.551F, -0.3102F));

		PartDefinition cube_r53 = frontrightleg2.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(0, 61).mirror().addBox(-1.05F, -0.5F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(59, 60).mirror().addBox(-0.95F, -1.4F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.75F, -1.2F, 0.0126F, -0.3007F, -1.6251F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6987F, 2.5754F, -0.568F, -0.2199F, -0.5455F, -0.011F));

		PartDefinition cube_r54 = frontrightleg3.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(47, 32).mirror().addBox(-2.25F, -1.5F, -2.0F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0697F, -1.2466F, -0.9564F, 0.0F, 0.0F, -1.5708F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.4509F, -3.506F, -0.4058F, 0.2145F, -0.0404F));

		PartDefinition cube_r55 = neck.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(15, 85).addBox(-0.5F, -0.3F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(67, 67).addBox(-1.0F, 0.3F, 1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.45F, 0.288F, 0.0F, 0.0F));

		PartDefinition cube_r56 = neck.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(83, 42).mirror().addBox(-0.9829F, -0.5529F, -0.4319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -0.8751F, -1.9985F, -0.0373F, 0.0848F, -0.6498F));

		PartDefinition cube_r57 = neck.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(82, 55).mirror().addBox(-0.9829F, -0.5214F, -0.4778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -0.8751F, -1.9985F, -0.2555F, 0.0848F, -0.6498F));

		PartDefinition cube_r58 = neck.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(47, 77).mirror().addBox(-0.4687F, -0.6512F, -0.5082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -0.8751F, -1.9985F, -0.252F, 0.0759F, -0.0911F));

		PartDefinition cube_r59 = neck.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(77, 37).mirror().addBox(-0.4687F, -0.6862F, -0.4335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -0.8751F, -1.9985F, -0.0338F, 0.0759F, -0.0911F));

		PartDefinition cube_r60 = neck.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(65, 37).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.0F, 0.4274F, -1.401F, 0.258F, 0.1293F, -0.4544F));

		PartDefinition cube_r61 = neck.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(65, 37).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4274F, -1.401F, 0.258F, -0.1293F, 0.4544F));

		PartDefinition cube_r62 = neck.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(77, 37).addBox(-0.5313F, -0.6862F, -0.4335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -0.8751F, -1.9985F, -0.0338F, -0.0759F, 0.0911F));

		PartDefinition cube_r63 = neck.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(47, 77).addBox(-0.5313F, -0.6512F, -0.5082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.142F, -0.8751F, -1.9985F, -0.252F, -0.0759F, 0.0911F));

		PartDefinition cube_r64 = neck.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(82, 55).addBox(-0.0171F, -0.5214F, -0.4778F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.142F, -0.8751F, -1.9985F, -0.2555F, -0.0848F, 0.6498F));

		PartDefinition cube_r65 = neck.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(83, 42).addBox(-0.0171F, -0.5529F, -0.4319F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -0.8751F, -1.9985F, -0.0373F, -0.0848F, 0.6498F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.51F, -1.7503F, 0.2962F, 0.335F, 0.1F));

		PartDefinition cube_r66 = neck2.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(17, 73).addBox(-0.5F, -0.9F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(26, 46).addBox(-1.0F, -0.3F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r67 = neck2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(71, 77).mirror().addBox(-0.9829F, -0.5478F, -0.4664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.485F, -0.5482F, -0.1899F, -0.0319F, -0.6538F));

		PartDefinition cube_r68 = neck2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(78, 21).mirror().addBox(-0.9829F, -0.5089F, -0.5103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.485F, -0.5482F, -0.4081F, -0.0319F, -0.6538F));

		PartDefinition cube_r69 = neck2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(76, 77).mirror().addBox(-0.4676F, -0.6445F, -0.5243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.485F, -0.5482F, -0.4435F, 0.0571F, -0.1038F));

		PartDefinition cube_r70 = neck2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(20, 79).mirror().addBox(-0.4676F, -0.6832F, -0.4507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.485F, -0.5482F, -0.2253F, 0.0571F, -0.1038F));

		PartDefinition cube_r71 = neck2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(42, 76).mirror().addBox(-0.4669F, -0.6412F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.61F, -1.2482F, -0.3913F, 0.0625F, -0.1007F));

		PartDefinition cube_r72 = neck2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(82, 83).mirror().addBox(-0.4669F, -0.6821F, -0.4611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.858F, -1.61F, -1.2482F, -0.1731F, 0.0625F, -0.1007F));

		PartDefinition cube_r73 = neck2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(61, 42).mirror().addBox(-0.6F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)).mirror(false), PartPose.offsetAndRotation(-1.1F, -0.1488F, -1.5236F, -0.0898F, -0.0539F, -0.5386F));

		PartDefinition cube_r74 = neck2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(20, 79).addBox(-0.5324F, -0.6832F, -0.4507F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -1.485F, -0.5482F, -0.2253F, -0.0571F, 0.1038F));

		PartDefinition cube_r75 = neck2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(76, 77).addBox(-0.5324F, -0.6445F, -0.5243F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.142F, -1.485F, -0.5482F, -0.4435F, -0.0571F, 0.1038F));

		PartDefinition cube_r76 = neck2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(78, 21).addBox(-0.0171F, -0.5089F, -0.5103F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.142F, -1.485F, -0.5482F, -0.4081F, 0.0319F, 0.6538F));

		PartDefinition cube_r77 = neck2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(71, 77).addBox(-0.0171F, -0.5478F, -0.4664F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -1.485F, -0.5482F, -0.1899F, 0.0319F, 0.6538F));

		PartDefinition cube_r78 = neck2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(82, 83).addBox(-0.5331F, -0.6821F, -0.4611F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.142F, -1.61F, -1.2482F, -0.1731F, -0.0625F, 0.1007F));

		PartDefinition cube_r79 = neck2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(42, 76).addBox(-0.5331F, -0.6412F, -0.5342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(-0.142F, -1.61F, -1.2482F, -0.3913F, -0.0625F, 0.1007F));

		PartDefinition cube_r80 = neck2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(61, 42).addBox(-0.4F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.002F)), PartPose.offsetAndRotation(0.1F, -0.1488F, -1.5236F, -0.0898F, 0.0539F, 0.5386F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create().texOffs(42, 73).addBox(-1.0F, 0.233F, -2.0095F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.5F, -0.5727F, -2.2565F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition cube_r81 = head.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(57, 48).addBox(-1.5F, -0.95F, -0.5F, 3.0F, 2.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.0F, -0.5665F, -1.2409F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r82 = head.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(51, 16).addBox(-1.997F, -1.0F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.497F, -1.4124F, -1.8967F, 1.8413F, 0.0F, 0.0F));

		PartDefinition cube_r83 = head.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(66, 42).addBox(-0.497F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.003F, -0.7826F, -3.8082F, 2.1729F, 0.0F, 0.0F));

		PartDefinition cube_r84 = head.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(57, 44).addBox(-1.492F, -1.0F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(0.492F, -1.1388F, -2.8663F, 1.9373F, 0.0F, 0.0F));

		PartDefinition cube_r85 = head.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(82, 52).addBox(-0.492F, -0.85F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.008F, -0.2081F, -4.6322F, 2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r86 = head.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(62, 6).addBox(-2.0F, 0.0F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.5F, -1.174F, -2.1146F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r87 = head.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(23, 57).addBox(-2.0F, -1.35F, 0.05F, 3.0F, 2.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(0.5F, 0.733F, -2.5095F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.575F, -1.4452F, -1.1178F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(81, 68).addBox(-0.8937F, -1.9859F, -2.2589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.15F, 2.0678F, 1.3656F, 0.1273F, 0.0259F, -0.1397F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(71, 13).addBox(-0.8937F, -1.7567F, -2.1887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.15F, 2.0678F, 1.3656F, -0.0036F, 0.0259F, -0.1397F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(81, 65).addBox(-1.0F, -0.7641F, -2.3387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F))
				.texOffs(30, 67).addBox(-1.0F, -0.7641F, -1.9887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(0.15F, 2.0678F, 1.3656F, 0.0F, 0.0262F, 0.0F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(78, 24).addBox(-0.5F, -0.841F, -0.4858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(83, 12).addBox(-0.5F, -0.216F, -0.4858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(-0.25F, 1.1111F, 1.2405F, 0.4974F, 0.0F, -0.0873F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(83, 3).addBox(-0.5F, -0.1867F, -0.6239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.25F, 1.1111F, 1.2405F, 0.8029F, 0.0F, -0.0873F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(79, 74).addBox(-0.85F, -0.2542F, -0.8545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.15F, 2.0678F, 1.3656F, 0.3665F, 0.0262F, 0.0F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(45, 83).addBox(-1.0F, -2.3203F, -0.8177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.15F, 2.0678F, 1.3656F, 1.5708F, 0.0262F, 0.0F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(83, 15).addBox(-1.0F, -1.0197F, -1.5529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.15F, 2.0678F, 1.3656F, 0.5672F, 0.0262F, 0.0F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(28, 71).addBox(-1.0F, -0.3708F, -2.2159F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(0.15F, 2.0678F, 1.3656F, -0.1745F, 0.0262F, 0.0F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(53, 66).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)), PartPose.offsetAndRotation(0.1267F, 2.8604F, -0.7097F, 1.7284F, 0.1918F, 0.0028F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(66, 46).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.4533F, 3.0092F, -2.5957F, 1.5701F, 0.4011F, 0.0118F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(17, 76).addBox(-1.018F, -0.9641F, -1.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)), PartPose.offsetAndRotation(-0.352F, 1.9866F, -2.5605F, 1.5425F, 0.4841F, 0.0704F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(84, 33).addBox(-0.918F, -1.0641F, -0.1203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F))
				.texOffs(84, 30).addBox(-0.918F, -0.8641F, -0.1203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-0.352F, 1.9866F, -2.5605F, 1.4583F, 0.4782F, -0.1605F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(20, 82).addBox(-0.475F, -0.2205F, -0.4809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)), PartPose.offsetAndRotation(-1.2456F, 2.1079F, -3.822F, 2.5549F, 0.401F, 0.1274F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(15, 82).addBox(-0.475F, -0.4903F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(-1.2456F, 2.1079F, -3.822F, 2.9039F, 0.401F, 0.1274F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(81, 77).addBox(-0.475F, -0.5079F, -0.4637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(-1.2456F, 2.1079F, -3.822F, 2.424F, 0.401F, 0.1274F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(79, 71).addBox(-0.7F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1216F, 2.209F, -3.9498F, 2.6524F, 0.4042F, 0.0404F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(72, 83).addBox(-0.5F, -0.15F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.4337F, -0.1164F, 0.8019F, 0.5672F, 0.0F, -0.2094F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(83, 21).addBox(-0.85F, -0.15F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0586F, 0.1989F, -1.2523F, 0.2394F, 0.1139F, -0.1608F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(82, 80).addBox(-1.0207F, -1.4487F, -1.5466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.352F, 1.9866F, -2.5605F, 0.9515F, 0.3739F, 0.2751F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(10, 84).addBox(-1.051F, -1.0021F, 0.3478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.352F, 1.9866F, -2.5605F, 2.3781F, 0.3483F, 0.2373F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(22, 76).addBox(-1.0858F, 0.3204F, -0.5802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.352F, 1.9866F, -2.5605F, -2.5435F, 0.131F, 0.0151F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(83, 39).addBox(-0.85F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2347F, 0.6227F, -2.5704F, -0.9621F, 0.7216F, 0.2843F));

		PartDefinition cube_r111 = leftFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(83, 24).addBox(-0.85F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1084F, 0.375F, -1.928F, 0.3599F, 0.1975F, -0.0088F));

		PartDefinition cube_r112 = leftFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(83, 18).addBox(-0.85F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0586F, 0.1989F, -1.2523F, 0.2413F, 0.1097F, -0.1437F));

		PartDefinition cube_r113 = leftFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(77, 83).addBox(-0.9F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0019F, -0.009F, -0.5845F, 0.2799F, 0.0671F, -0.1902F));

		PartDefinition cube_r114 = leftFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(81, 49).addBox(-0.9F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0234F, -0.1102F, 0.1079F, 0.1484F, 0.0F, -0.2094F));

		PartDefinition cube_r115 = leftFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(62, 79).addBox(-0.9F, -0.15F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0207F, -0.0974F, 0.0087F, 0.1309F, 0.0F, -0.2094F));

		PartDefinition cube_r116 = leftFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(57, 79).addBox(-0.2849F, -0.5416F, -0.5087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(52, 79).addBox(-0.4349F, -0.5416F, -0.5087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-0.3598F, 1.4306F, -1.4838F, 1.9772F, 0.3921F, 0.0658F));

		PartDefinition cube_r117 = leftFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(30, 84).addBox(-0.85F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.0259F, 0.8541F, -1.9431F, 2.3865F, 0.38F, 0.0834F));

		PartDefinition cube_r118 = leftFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(42, 79).addBox(-0.4096F, -0.9063F, -0.2657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3598F, 1.4306F, -1.4838F, 2.3448F, 0.4735F, -0.0173F));

		PartDefinition cube_r119 = leftFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(83, 0).addBox(-0.4342F, -0.4127F, -0.2082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3598F, 1.4306F, -1.4838F, 1.7182F, 0.1898F, 0.0069F));

		PartDefinition cube_r120 = leftFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(79, 33).addBox(-0.3923F, -0.3488F, -0.1118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3598F, 1.4306F, -1.4838F, 0.9007F, 0.033F, 0.0096F));

		PartDefinition cube_r121 = leftFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(0, 83).addBox(-0.3923F, -0.1028F, -0.2679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)), PartPose.offsetAndRotation(-0.3598F, 1.4306F, -1.4838F, 1.2497F, 0.033F, 0.0096F));

		PartDefinition cube_r122 = leftFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(25, 84).addBox(-0.4842F, -0.4106F, -0.8302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3598F, 1.4306F, -1.4838F, 2.1283F, 0.1898F, 0.0069F));

		PartDefinition cube_r123 = leftFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(32, 62).addBox(-0.6965F, -1.486F, -1.7082F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.9115F, 2.9508F, -3.4263F, -1.4714F, 0.482F, 0.0321F));

		PartDefinition cube_r124 = leftFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(76, 8).addBox(-0.7F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.7482F, 2.5233F, -3.2288F, -1.0803F, -0.0287F, 1.4448F));

		PartDefinition cube_r125 = leftFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(0, 76).addBox(-0.6965F, -2.486F, -0.5082F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4551F, 2.8541F, -4.5103F, -1.4245F, 0.4707F, 0.1345F));

		PartDefinition cube_r126 = leftFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(78, 18).addBox(-0.7F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.1304F, 2.5647F, -3.9621F, 0.4564F, 0.123F, 1.5225F));

		PartDefinition cube_r127 = leftFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(78, 12).addBox(-0.6965F, -0.6476F, 0.1073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4551F, 2.8541F, -4.5103F, -0.0282F, 0.4707F, 0.1345F));

		PartDefinition cube_r128 = leftFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(10, 78).addBox(-0.6965F, -0.2893F, -0.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4551F, 2.8541F, -4.5103F, 1.4117F, 0.4707F, 0.1345F));

		PartDefinition cube_r129 = leftFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(78, 15).addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-1.4601F, 2.1098F, -4.1784F, 2.4717F, 0.315F, 0.126F));

		PartDefinition cube_r130 = leftFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(78, 0).addBox(-1.0293F, -1.8734F, 0.7844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.352F, 1.9866F, -2.5605F, 2.6113F, 0.315F, 0.126F));

		PartDefinition cube_r131 = leftFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(5, 84).addBox(-0.4696F, -0.5949F, -0.8166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3598F, 1.4306F, -1.4838F, 1.4671F, 0.2947F, 0.0377F));

		PartDefinition cube_r132 = leftFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(79, 30).addBox(-0.1474F, -0.2748F, 0.5413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(79, 27).addBox(-0.1474F, -0.2748F, -0.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.4F, 0.4F, 0.0F, -0.0701F, 0.3016F, -0.0969F));

		PartDefinition cube_r133 = leftFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(71, 17).addBox(-0.997F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(-0.578F, 0.6626F, -2.6904F, 2.1943F, 0.3544F, 0.1819F));

		PartDefinition cube_r134 = leftFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(71, 21).addBox(-0.992F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.083F, 0.3064F, -1.7485F, 1.9795F, 0.4927F, 0.1859F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.575F, -1.4452F, -1.1178F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(81, 68).mirror().addBox(-0.1063F, -1.9859F, -2.2589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.0678F, 1.3656F, 0.1273F, -0.0259F, 0.1397F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(71, 13).mirror().addBox(-0.1063F, -1.7567F, -2.1887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.0678F, 1.3656F, -0.0036F, -0.0259F, 0.1397F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(81, 65).mirror().addBox(0.0F, -0.7641F, -2.3387F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)).mirror(false)
				.texOffs(30, 67).mirror().addBox(0.0F, -0.7641F, -1.9887F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.0678F, 1.3656F, 0.0F, -0.0262F, 0.0F));

		PartDefinition cube_r138 = rightFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(78, 24).mirror().addBox(-0.5F, -0.841F, -0.4858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(83, 12).mirror().addBox(-0.5F, -0.216F, -0.4858F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)).mirror(false), PartPose.offsetAndRotation(0.25F, 1.1111F, 1.2405F, 0.4974F, 0.0F, 0.0873F));

		PartDefinition cube_r139 = rightFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(83, 3).mirror().addBox(-0.5F, -0.1867F, -0.6239F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.25F, 1.1111F, 1.2405F, 0.8029F, 0.0F, 0.0873F));

		PartDefinition cube_r140 = rightFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(79, 74).mirror().addBox(-0.15F, -0.2542F, -0.8545F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.0678F, 1.3656F, 0.3665F, -0.0262F, 0.0F));

		PartDefinition cube_r141 = rightFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(45, 83).mirror().addBox(0.0F, -2.3203F, -0.8177F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.0678F, 1.3656F, 1.5708F, -0.0262F, 0.0F));

		PartDefinition cube_r142 = rightFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(83, 15).mirror().addBox(0.0F, -1.0197F, -1.5529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.0678F, 1.3656F, 0.5672F, -0.0262F, 0.0F));

		PartDefinition cube_r143 = rightFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(28, 71).mirror().addBox(0.0F, -0.3708F, -2.2159F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-0.15F, 2.0678F, 1.3656F, -0.1745F, -0.0262F, 0.0F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(53, 66).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.001F)).mirror(false), PartPose.offsetAndRotation(-0.1267F, 2.8604F, -0.7097F, 1.7284F, -0.1918F, -0.0028F));

		PartDefinition cube_r145 = rightFace.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(66, 46).mirror().addBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.4533F, 3.0092F, -2.5957F, 1.5701F, -0.4011F, -0.0118F));

		PartDefinition cube_r146 = rightFace.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(17, 76).mirror().addBox(0.018F, -0.9641F, -1.0202F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.004F)).mirror(false), PartPose.offsetAndRotation(0.352F, 1.9866F, -2.5605F, 1.5425F, -0.4841F, -0.0704F));

		PartDefinition cube_r147 = rightFace.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(84, 33).mirror().addBox(-0.082F, -1.0641F, -0.1203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.104F)).mirror(false)
				.texOffs(84, 30).mirror().addBox(-0.082F, -0.8641F, -0.1203F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.352F, 1.9866F, -2.5605F, 1.4583F, -0.4782F, 0.1605F));

		PartDefinition cube_r148 = rightFace.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(20, 82).mirror().addBox(-0.525F, -0.2205F, -0.4809F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.348F)).mirror(false), PartPose.offsetAndRotation(1.2456F, 2.1079F, -3.822F, 2.5549F, -0.401F, -0.1274F));

		PartDefinition cube_r149 = rightFace.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(15, 82).mirror().addBox(-0.525F, -0.4903F, -0.5392F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(1.2456F, 2.1079F, -3.822F, 2.9039F, -0.401F, -0.1274F));

		PartDefinition cube_r150 = rightFace.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(81, 77).mirror().addBox(-0.525F, -0.5079F, -0.4637F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(1.2456F, 2.1079F, -3.822F, 2.424F, -0.401F, -0.1274F));

		PartDefinition cube_r151 = rightFace.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(79, 71).mirror().addBox(-0.3F, -0.7F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1216F, 2.209F, -3.9498F, 2.6524F, -0.4042F, -0.0404F));

		PartDefinition cube_r152 = rightFace.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(72, 83).mirror().addBox(-0.5F, -0.15F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.4337F, -0.1164F, 0.8019F, 0.5672F, 0.0F, 0.2094F));

		PartDefinition cube_r153 = rightFace.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(83, 21).mirror().addBox(-0.15F, -0.15F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1989F, -1.2523F, 0.2394F, -0.1139F, 0.1608F));

		PartDefinition cube_r154 = rightFace.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(82, 80).mirror().addBox(0.0207F, -1.4487F, -1.5466F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.352F, 1.9866F, -2.5605F, 0.9515F, -0.3739F, -0.2751F));

		PartDefinition cube_r155 = rightFace.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(10, 84).mirror().addBox(0.051F, -1.0021F, 0.3478F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.352F, 1.9866F, -2.5605F, 2.3781F, -0.3483F, -0.2373F));

		PartDefinition cube_r156 = rightFace.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(22, 76).mirror().addBox(0.0858F, 0.3204F, -0.5802F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.352F, 1.9866F, -2.5605F, -2.5435F, -0.131F, -0.0151F));

		PartDefinition cube_r157 = rightFace.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(83, 39).mirror().addBox(-0.15F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.2347F, 0.6227F, -2.5704F, -0.9621F, -0.7216F, -0.2843F));

		PartDefinition cube_r158 = rightFace.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(83, 24).mirror().addBox(-0.15F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.1084F, 0.375F, -1.928F, 0.3599F, -0.1975F, 0.0088F));

		PartDefinition cube_r159 = rightFace.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(83, 18).mirror().addBox(-0.15F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0586F, 0.1989F, -1.2523F, 0.2413F, -0.1097F, 0.1437F));

		PartDefinition cube_r160 = rightFace.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(77, 83).mirror().addBox(-0.1F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0019F, -0.009F, -0.5845F, 0.2799F, -0.0671F, 0.1902F));

		PartDefinition cube_r161 = rightFace.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(81, 49).mirror().addBox(-0.1F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0234F, -0.1102F, 0.1079F, 0.1484F, 0.0F, 0.2094F));

		PartDefinition cube_r162 = rightFace.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(62, 79).mirror().addBox(-0.1F, -0.15F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.0207F, -0.0974F, 0.0087F, 0.1309F, 0.0F, 0.2094F));

		PartDefinition cube_r163 = rightFace.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(57, 79).mirror().addBox(-0.7151F, -0.5416F, -0.5087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(52, 79).mirror().addBox(-0.5651F, -0.5416F, -0.5087F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.11F)).mirror(false), PartPose.offsetAndRotation(0.3598F, 1.4306F, -1.4838F, 1.9772F, -0.3921F, -0.0658F));

		PartDefinition cube_r164 = rightFace.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(30, 84).mirror().addBox(-0.15F, -0.825F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.0259F, 0.8541F, -1.9431F, 2.3865F, -0.38F, -0.0834F));

		PartDefinition cube_r165 = rightFace.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(42, 79).mirror().addBox(-0.5904F, -0.9063F, -0.2657F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3598F, 1.4306F, -1.4838F, 2.3448F, -0.4735F, 0.0173F));

		PartDefinition cube_r166 = rightFace.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(83, 0).mirror().addBox(-0.5658F, -0.4127F, -0.2082F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3598F, 1.4306F, -1.4838F, 1.7182F, -0.1898F, -0.0069F));

		PartDefinition cube_r167 = rightFace.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(79, 33).mirror().addBox(-0.6078F, -0.3488F, -0.1118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3598F, 1.4306F, -1.4838F, 0.9007F, -0.033F, -0.0096F));

		PartDefinition cube_r168 = rightFace.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(0, 83).mirror().addBox(-0.6078F, -0.1028F, -0.2679F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F)).mirror(false), PartPose.offsetAndRotation(0.3598F, 1.4306F, -1.4838F, 1.2497F, -0.033F, -0.0096F));

		PartDefinition cube_r169 = rightFace.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(25, 84).mirror().addBox(-0.5158F, -0.4106F, -0.8302F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3598F, 1.4306F, -1.4838F, 2.1283F, -0.1898F, -0.0069F));

		PartDefinition cube_r170 = rightFace.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(32, 62).mirror().addBox(-0.3035F, -1.486F, -1.7082F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.9115F, 2.9508F, -3.4263F, -1.4714F, -0.482F, -0.0321F));

		PartDefinition cube_r171 = rightFace.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(76, 8).mirror().addBox(-0.3F, -1.0F, -0.3F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.7482F, 2.5233F, -3.2288F, -1.0803F, 0.0287F, -1.4448F));

		PartDefinition cube_r172 = rightFace.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(0, 76).mirror().addBox(-0.3035F, -2.486F, -0.5082F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4551F, 2.8541F, -4.5103F, -1.4245F, -0.4707F, -0.1345F));

		PartDefinition cube_r173 = rightFace.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(78, 18).mirror().addBox(-0.3F, -0.3F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.1304F, 2.5647F, -3.9621F, 0.4564F, -0.123F, -1.5225F));

		PartDefinition cube_r174 = rightFace.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(78, 12).mirror().addBox(-0.3035F, -0.6476F, 0.1073F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4551F, 2.8541F, -4.5103F, -0.0282F, -0.4707F, -0.1345F));

		PartDefinition cube_r175 = rightFace.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(10, 78).mirror().addBox(-0.3035F, -0.2893F, -0.2988F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4551F, 2.8541F, -4.5103F, 1.4117F, -0.4707F, -0.1345F));

		PartDefinition cube_r176 = rightFace.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(78, 15).mirror().addBox(-0.5F, -0.3F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(1.4601F, 2.1098F, -4.1784F, 2.4717F, -0.315F, -0.126F));

		PartDefinition cube_r177 = rightFace.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(78, 0).mirror().addBox(0.0293F, -1.8734F, 0.7844F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(0.352F, 1.9866F, -2.5605F, 2.6113F, -0.315F, -0.126F));

		PartDefinition cube_r178 = rightFace.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(5, 84).mirror().addBox(-0.5304F, -0.5949F, -0.8166F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3598F, 1.4306F, -1.4838F, 1.4671F, -0.2947F, -0.0377F));

		PartDefinition cube_r179 = rightFace.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(79, 30).mirror().addBox(-0.8526F, -0.2748F, 0.5413F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(79, 27).mirror().addBox(-0.8526F, -0.2748F, -0.1587F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(1.4F, 0.4F, 0.0F, -0.0701F, -0.3016F, 0.0969F));

		PartDefinition cube_r180 = rightFace.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(71, 17).mirror().addBox(-0.003F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.001F)).mirror(false), PartPose.offsetAndRotation(0.578F, 0.6626F, -2.6904F, 2.1943F, -0.3544F, -0.1819F));

		PartDefinition cube_r181 = rightFace.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(71, 21).mirror().addBox(-0.008F, -1.0F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.083F, 0.3064F, -1.7485F, 1.9795F, -0.4927F, -0.1859F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3085F, -0.167F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r182 = lowerjaw.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(0, 80).mirror().addBox(-0.5F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)).mirror(false)
				.texOffs(0, 80).addBox(2.1F, -0.625F, -0.475F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.147F)), PartPose.offsetAndRotation(-1.3F, 0.5F, -0.175F, 0.3054F, 0.0F, 0.0F));

		PartDefinition cube_r183 = lowerjaw.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(80, 46).mirror().addBox(-0.5F, -0.725F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(80, 46).addBox(2.1F, -0.725F, -0.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3F, 0.5F, -0.175F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r184 = lowerjaw.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(47, 80).mirror().addBox(-0.5F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(47, 80).addBox(2.1F, -0.45F, -0.425F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.3F, 0.3236F, -0.9301F, -0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r185 = lowerjaw.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(37, 67).mirror().addBox(-0.125F, -0.15F, -1.8237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-1.675F, -0.0343F, -1.158F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r186 = lowerjaw.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(67, 50).mirror().addBox(-0.5F, -0.525F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)).mirror(false)
				.texOffs(67, 50).addBox(2.1F, -0.525F, -1.225F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.145F)), PartPose.offsetAndRotation(-1.3F, 0.5F, -0.175F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r187 = lowerjaw.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(60, 67).mirror().addBox(-0.125F, 0.0593F, -1.9034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-1.675F, -0.0343F, -1.158F, -0.0262F, -0.1745F, 0.0F));

		PartDefinition cube_r188 = lowerjaw.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(0, 64).mirror().addBox(-0.1926F, -0.1964F, -1.826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-1.375F, -0.0343F, -2.758F, -0.0698F, -0.4538F, 0.0F));

		PartDefinition cube_r189 = lowerjaw.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(23, 64).mirror().addBox(-0.1926F, 0.049F, -1.7367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.375F, -0.0343F, -2.758F, -0.1745F, -0.4538F, 0.0F));

		PartDefinition cube_r190 = lowerjaw.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(82, 36).mirror().addBox(-0.1926F, 0.2024F, -2.2397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)).mirror(false), PartPose.offsetAndRotation(-1.375F, -0.0343F, -2.758F, -0.2793F, -0.4538F, 0.0F));

		PartDefinition cube_r191 = lowerjaw.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(40, 82).mirror().addBox(-0.1926F, -0.0641F, -2.3002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-1.375F, -0.0343F, -2.758F, -0.1571F, -0.4538F, 0.0F));

		PartDefinition cube_r192 = lowerjaw.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(52, 82).mirror().addBox(-0.2F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.4451F, 0.0925F, -4.6477F, -0.3438F, -0.3345F, 0.0553F));

		PartDefinition cube_r193 = lowerjaw.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(60, 67).addBox(-0.875F, 0.0593F, -1.9034F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.675F, -0.0343F, -1.158F, -0.0262F, 0.1745F, 0.0F));

		PartDefinition cube_r194 = lowerjaw.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(52, 82).addBox(-0.8F, -0.5F, -0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.4451F, 0.0925F, -4.6477F, -0.3438F, 0.3345F, -0.0553F));

		PartDefinition cube_r195 = lowerjaw.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(40, 82).addBox(-0.8074F, -0.0641F, -2.3002F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.375F, -0.0343F, -2.758F, -0.1571F, 0.4538F, 0.0F));

		PartDefinition cube_r196 = lowerjaw.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(82, 36).addBox(-0.8074F, 0.2024F, -2.2397F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.203F)), PartPose.offsetAndRotation(1.375F, -0.0343F, -2.758F, -0.2793F, 0.4538F, 0.0F));

		PartDefinition cube_r197 = lowerjaw.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(23, 64).addBox(-0.8074F, 0.049F, -1.7367F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(1.375F, -0.0343F, -2.758F, -0.1745F, 0.4538F, 0.0F));

		PartDefinition cube_r198 = lowerjaw.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(0, 64).addBox(-0.8074F, -0.1964F, -1.826F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(1.375F, -0.0343F, -2.758F, -0.0698F, 0.4538F, 0.0F));

		PartDefinition cube_r199 = lowerjaw.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(37, 67).addBox(-0.875F, -0.15F, -1.8237F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(1.675F, -0.0343F, -1.158F, 0.0F, 0.1745F, 0.0F));

		PartDefinition tail = Waluchelys.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(68, 54).addBox(-0.5F, -0.8F, 0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.002F))
				.texOffs(86, 6).addBox(0.0F, -1.3F, 0.05F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.002F)), PartPose.offsetAndRotation(-0.5F, -2.9206F, 8.6031F, -0.3659F, 0.1941F, 0.018F));

		PartDefinition cube_r200 = tail.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(38, 25).mirror().addBox(-1.5F, 0.0F, -1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2F, 1.55F, 0.0F, 0.0F, -0.3142F));

		PartDefinition cube_r201 = tail.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(38, 25).addBox(-0.5F, 0.0F, -1.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2F, 1.55F, 0.0F, 0.0F, 0.3142F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(37, 46).addBox(-0.5F, -0.7125F, -0.119F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(59, 85).addBox(0.0F, -1.0125F, -0.119F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 85).addBox(0.0F, -1.0125F, 1.881F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.065F, 2.0122F, -0.0791F, 0.1305F, -0.0103F));

		PartDefinition cube_r202 = tail2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(84, 71).mirror().addBox(-1.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(84, 73).mirror().addBox(-0.7F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2125F, 2.381F, 0.0F, 0.0F, -0.384F));

		PartDefinition cube_r203 = tail2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(84, 73).addBox(-0.3F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(84, 71).addBox(0.0F, 0.0F, -2.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2125F, 2.381F, 0.0F, 0.0F, 0.384F));

		PartDefinition cube_r204 = tail2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -0.4F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4875F, 2.381F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0317F, 3.8526F, -0.0195F, 0.1309F, -0.0026F));

		PartDefinition cube_r205 = tail3.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(35, 84).mirror().addBox(-0.6F, 0.0F, -1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3436F, 1.4901F, 0.0984F, 0.0358F, -0.3473F));

		PartDefinition cube_r206 = tail3.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(35, 84).addBox(-0.4F, 0.0F, -1.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3436F, 1.4901F, 0.0984F, -0.0358F, 0.3473F));

		PartDefinition cube_r207 = tail3.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(85, 58).addBox(0.0F, -1.3F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(56, 85).addBox(0.0F, -1.3F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.001F))
				.texOffs(22, 52).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.001F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.15F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r208 = tail3.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(21, 85).addBox(0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0418F, 2.2555F, 0.5323F, 0.0F, 0.0F));

		PartDefinition cube_r209 = tail3.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(18, 85).addBox(0.0F, 0.6F, 1.4F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5192F, -1.4717F, 0.5672F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(85, 45).addBox(0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.6799F, 2.8384F, 0.028F, 0.1255F, 0.0373F));

		PartDefinition cube_r210 = tail4.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(40, 85).addBox(0.0F, 0.7F, 1.6F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7217F, -0.5829F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(21, 68).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F))
				.texOffs(53, 85).addBox(0.0F, -0.5F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0313F, 1.8341F, 0.0611F, 0.1307F, 0.008F));

		PartDefinition cube_r211 = tail5.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(50, 85).addBox(0.0F, 1.4F, 3.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.6905F, -2.417F, 0.5323F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(71, 25).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.0197F, 1.9602F, -0.0682F, 0.2613F, 0.0162F));

		PartDefinition leftCarapace = Waluchelys.addOrReplaceChild("leftCarapace", CubeListBuilder.create().texOffs(0, 11).addBox(-1.1F, -0.4F, -3.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.007F)), PartPose.offset(1.0F, 0.5F, 0.25F));

		PartDefinition cube_r212 = leftCarapace.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(0, 28).addBox(-0.0016F, -0.0035F, -3.8001F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -0.0712F, 0.0332F, 0.4352F));

		PartDefinition cube_r213 = leftCarapace.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(13, 41).addBox(3.937F, -0.6977F, -3.8001F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -0.0644F, 0.045F, 0.6094F));

		PartDefinition cube_r214 = leftCarapace.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(78, 3).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(-0.1F, 0.1F, 4.75F, 0.0F, -0.3927F, 0.0F));

		PartDefinition cube_r215 = leftCarapace.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(5, 78).addBox(0.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0397F, 0.1F, 6.413F, 0.0F, 0.9076F, 0.0F));

		PartDefinition cube_r216 = leftCarapace.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(11, 47).addBox(0.2194F, -0.6459F, -6.1799F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -0.1724F, 0.0816F, 0.0355F));

		PartDefinition cube_r217 = leftCarapace.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(51, 70).addBox(-0.0336F, -0.724F, 3.099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0733F, 0.0175F, -0.2183F));

		PartDefinition cube_r218 = leftCarapace.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(71, 0).addBox(2.5269F, -0.724F, 3.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F))
				.texOffs(70, 37).addBox(2.5269F, -0.724F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0859F, -0.548F, -0.2644F));

		PartDefinition cube_r219 = leftCarapace.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(72, 33).addBox(1.5444F, -0.724F, 5.6209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0787F, -0.3741F, -0.2484F));

		PartDefinition cube_r220 = leftCarapace.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(62, 82).addBox(3.0975F, -0.724F, 0.8509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.1062F, -0.8086F, -0.2966F));

		PartDefinition cube_r221 = leftCarapace.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(23, 7).addBox(-2.7355F, -0.9589F, -1.9713F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0F, -1.5708F, -0.2094F));

		PartDefinition cube_r222 = leftCarapace.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(40, 7).addBox(-1.5355F, -0.2869F, -3.8258F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(46, 62).addBox(-0.5355F, -0.2869F, -7.2258F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(39, 41).addBox(-0.7355F, -0.2869F, -6.8258F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0F, -1.5708F, -0.5585F));

		PartDefinition cube_r223 = leftCarapace.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(71, 4).addBox(-1.7567F, -0.2869F, -7.7675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -3.1416F, -1.0472F, 2.5831F));

		PartDefinition cube_r224 = leftCarapace.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(65, 71).addBox(0.426F, -0.2869F, -6.6187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -3.1416F, -1.3963F, 2.5831F));

		PartDefinition cube_r225 = leftCarapace.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(67, 83).addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F))
				.texOffs(83, 61).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.1052F, -3.0857F, -4.9492F, -1.3055F, -1.16F, 0.545F));

		PartDefinition cube_r226 = leftCarapace.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(55, 63).addBox(-3.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(6.3812F, -2.6439F, -1.9948F, -1.5708F, -1.3963F, 1.0123F));

		PartDefinition cube_r227 = leftCarapace.addOrReplaceChild("cube_r227", CubeListBuilder.create().texOffs(49, 11).addBox(-2.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)), PartPose.offsetAndRotation(4.7699F, -1.637F, -2.1948F, -1.5708F, -1.3526F, 1.0123F));

		PartDefinition cube_r228 = leftCarapace.addOrReplaceChild("cube_r228", CubeListBuilder.create().texOffs(0, 57).addBox(-0.7355F, -1.018F, -4.1439F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F))
				.texOffs(56, 35).addBox(-0.7355F, -1.018F, -2.1439F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(3.1755F, -0.6195F, -2.8593F, -0.2483F, -0.8965F, -0.4206F));

		PartDefinition cube_r229 = leftCarapace.addOrReplaceChild("cube_r229", CubeListBuilder.create().texOffs(53, 5).addBox(-4.8049F, 0.0243F, -6.8522F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -3.0652F, -0.4371F, 2.4643F));

		PartDefinition cube_r230 = leftCarapace.addOrReplaceChild("cube_r230", CubeListBuilder.create().texOffs(53, 0).addBox(-0.5F, -0.575F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(5.5433F, -2.6447F, 2.9201F, 3.1134F, 0.0504F, 2.6106F));

		PartDefinition cube_r231 = leftCarapace.addOrReplaceChild("cube_r231", CubeListBuilder.create().texOffs(72, 29).addBox(2.9115F, -0.219F, -3.6398F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -0.0349F, -1.1345F, -0.5585F));

		PartDefinition cube_r232 = leftCarapace.addOrReplaceChild("cube_r232", CubeListBuilder.create().texOffs(21, 72).addBox(3.1241F, -0.2869F, -1.5394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0F, -0.9599F, -0.5585F));

		PartDefinition cube_r233 = leftCarapace.addOrReplaceChild("cube_r233", CubeListBuilder.create().texOffs(0, 72).addBox(-2.2F, -0.2869F, -3.7411F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, 0.0F, -1.5272F, -0.5585F));

		PartDefinition cube_r234 = leftCarapace.addOrReplaceChild("cube_r234", CubeListBuilder.create().texOffs(58, 71).addBox(-3.1363F, -0.2869F, -3.0429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -3.1416F, -1.309F, 2.5831F));

		PartDefinition cube_r235 = leftCarapace.addOrReplaceChild("cube_r235", CubeListBuilder.create().texOffs(10, 81).addBox(-3.352F, -0.9589F, 0.4655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -3.1416F, -0.8378F, 2.9322F));

		PartDefinition cube_r236 = leftCarapace.addOrReplaceChild("cube_r236", CubeListBuilder.create().texOffs(57, 82).addBox(-2.872F, -0.4109F, 2.0723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1245F, 0.5804F, -1.4593F, -2.8798F, -0.576F, 2.9322F));

		PartDefinition cube_r237 = leftCarapace.addOrReplaceChild("cube_r237", CubeListBuilder.create().texOffs(23, 0).addBox(-0.1678F, -0.4099F, -8.7878F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, 0.0316F, -0.0147F, 0.4361F));

		PartDefinition cube_r238 = leftCarapace.addOrReplaceChild("cube_r238", CubeListBuilder.create().texOffs(32, 34).addBox(3.7115F, -1.0699F, -8.7878F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, 0.0286F, -0.02F, 0.6106F));

		PartDefinition cube_r239 = leftCarapace.addOrReplaceChild("cube_r239", CubeListBuilder.create().texOffs(62, 26).addBox(0.0F, -1.0F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 23).addBox(0.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 20).addBox(0.0F, -1.0F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.9917F, -1.5266F, -0.0346F, -0.0043F, -0.1221F));

		PartDefinition cube_r240 = leftCarapace.addOrReplaceChild("cube_r240", CubeListBuilder.create().texOffs(62, 17).addBox(0.0F, -0.9868F, -2.08F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(62, 14).addBox(0.0F, -0.9868F, -0.08F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.569F, 3.9062F, -0.1571F, 0.0F, -0.1222F));

		PartDefinition cube_r241 = leftCarapace.addOrReplaceChild("cube_r241", CubeListBuilder.create().texOffs(9, 62).addBox(0.0F, -1.379F, 1.6609F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.569F, 3.9062F, -0.3752F, 0.0F, -0.1222F));

		PartDefinition cube_r242 = leftCarapace.addOrReplaceChild("cube_r242", CubeListBuilder.create().texOffs(26, 41).addBox(-0.9677F, -2.1251F, -11.4935F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.016F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, 0.2302F, -0.106F, 0.4241F));

		PartDefinition cube_r243 = leftCarapace.addOrReplaceChild("cube_r243", CubeListBuilder.create().texOffs(0, 52).addBox(4.8976F, -2.1252F, -10.1247F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, 0.2354F, 0.2338F, 0.5044F));

		PartDefinition cube_r244 = leftCarapace.addOrReplaceChild("cube_r244", CubeListBuilder.create().texOffs(44, 69).addBox(5.5946F, -2.828F, -9.1247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, 0.2618F, 0.2037F, 0.6257F));

		PartDefinition cube_r245 = leftCarapace.addOrReplaceChild("cube_r245", CubeListBuilder.create().texOffs(35, 81).addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F))
				.texOffs(30, 81).addBox(0.0F, -0.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(4.3962F, -3.8467F, -7.804F, 2.6244F, -1.0325F, -2.1157F));

		PartDefinition cube_r246 = leftCarapace.addOrReplaceChild("cube_r246", CubeListBuilder.create().texOffs(25, 81).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(5.1475F, -3.5468F, -7.2161F, 0.3187F, -0.6285F, 0.3799F));

		PartDefinition cube_r247 = leftCarapace.addOrReplaceChild("cube_r247", CubeListBuilder.create().texOffs(49, 74).addBox(-2.0F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)), PartPose.offsetAndRotation(4.8234F, -3.5987F, -7.7183F, 0.294F, 0.506F, 0.7173F));

		PartDefinition cube_r248 = leftCarapace.addOrReplaceChild("cube_r248", CubeListBuilder.create().texOffs(58, 52).addBox(4.7523F, -0.1353F, 1.6397F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -0.2366F, -0.7722F, 0.6256F));

		PartDefinition cube_r249 = leftCarapace.addOrReplaceChild("cube_r249", CubeListBuilder.create().texOffs(75, 52).addBox(-8.035F, -0.1353F, -2.442F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -2.8455F, 0.9575F, -2.4382F));

		PartDefinition cube_r250 = leftCarapace.addOrReplaceChild("cube_r250", CubeListBuilder.create().texOffs(28, 75).addBox(-8.1204F, -0.1353F, 2.2765F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -1.7179F, 1.4002F, -1.2611F));

		PartDefinition cube_r251 = leftCarapace.addOrReplaceChild("cube_r251", CubeListBuilder.create().texOffs(71, 62).addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(3.5988F, -3.5931F, 8.2432F, -0.4283F, -1.1358F, 0.9594F));

		PartDefinition cube_r252 = leftCarapace.addOrReplaceChild("cube_r252", CubeListBuilder.create().texOffs(60, 10).addBox(-1.0335F, -0.5F, -0.192F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(6.0989F, -3.2367F, 0.9563F, -0.0648F, -0.3585F, 0.4584F));

		PartDefinition cube_r253 = leftCarapace.addOrReplaceChild("cube_r253", CubeListBuilder.create().texOffs(35, 75).addBox(-1.683F, -0.5F, -0.933F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(6.0989F, -3.2367F, 0.9563F, -0.3556F, -1.3956F, 0.7862F));

		PartDefinition cube_r254 = leftCarapace.addOrReplaceChild("cube_r254", CubeListBuilder.create().texOffs(72, 74).addBox(-1.3772F, -0.5F, -0.9464F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(5.8493F, -3.1902F, 2.859F, -0.4791F, -1.3694F, 0.9076F));

		PartDefinition cube_r255 = leftCarapace.addOrReplaceChild("cube_r255", CubeListBuilder.create().texOffs(59, 56).addBox(-0.947F, -0.5F, -0.418F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.8493F, -3.1902F, 2.859F, -0.1296F, -0.7765F, 0.5278F));

		PartDefinition cube_r256 = leftCarapace.addOrReplaceChild("cube_r256", CubeListBuilder.create().texOffs(50, 58).addBox(-0.947F, -0.5F, -0.418F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(5.4493F, -3.1652F, 4.559F, -0.2038F, -0.9522F, 0.589F));

		PartDefinition cube_r257 = leftCarapace.addOrReplaceChild("cube_r257", CubeListBuilder.create().texOffs(74, 66).addBox(-1.3772F, -0.5F, -0.9464F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(5.4493F, -3.1652F, 4.559F, -1.589F, -1.4532F, 2.0114F));

		PartDefinition cube_r258 = leftCarapace.addOrReplaceChild("cube_r258", CubeListBuilder.create().texOffs(74, 49).addBox(-1.2338F, -0.5F, -0.7416F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)), PartPose.offsetAndRotation(4.5034F, -3.4419F, 6.2284F, -2.3235F, -1.3286F, 2.8702F));

		PartDefinition cube_r259 = leftCarapace.addOrReplaceChild("cube_r259", CubeListBuilder.create().texOffs(41, 58).addBox(-0.947F, -0.5F, -0.168F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(4.5034F, -3.4419F, 6.2284F, -0.3927F, -1.0958F, 0.8849F));

		PartDefinition cube_r260 = leftCarapace.addOrReplaceChild("cube_r260", CubeListBuilder.create().texOffs(73, 46).addBox(4.7196F, -0.4398F, 1.1174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -0.2127F, -0.593F, 0.687F));

		PartDefinition cube_r261 = leftCarapace.addOrReplaceChild("cube_r261", CubeListBuilder.create().texOffs(84, 27).addBox(-1.4791F, -0.2708F, 5.8256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F))
				.texOffs(75, 55).addBox(-0.6159F, -0.2685F, 5.8213F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -0.3878F, 1.0165F, 0.1875F));

		PartDefinition cube_r262 = leftCarapace.addOrReplaceChild("cube_r262", CubeListBuilder.create().texOffs(56, 31).addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(5.8587F, -2.908F, 4.9883F, -0.5462F, 1.303F, 0.0013F));

		PartDefinition cube_r263 = leftCarapace.addOrReplaceChild("cube_r263", CubeListBuilder.create().texOffs(51, 24).addBox(0.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(6.3952F, -2.9218F, 3.0922F, -0.8265F, 1.4686F, -0.2977F));

		PartDefinition cube_r264 = leftCarapace.addOrReplaceChild("cube_r264", CubeListBuilder.create().texOffs(51, 20).addBox(0.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(6.7022F, -3.016F, 0.1036F, -2.1048F, 1.5186F, -1.5803F));

		PartDefinition cube_r265 = leftCarapace.addOrReplaceChild("cube_r265", CubeListBuilder.create().texOffs(32, 58).addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(6.3754F, -3.3227F, -4.6337F, 0.1093F, 0.3648F, 0.5552F));

		PartDefinition cube_r266 = leftCarapace.addOrReplaceChild("cube_r266", CubeListBuilder.create().texOffs(9, 58).addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(6.7363F, -3.1832F, -2.6715F, 2.9826F, 1.3761F, -2.7728F));

		PartDefinition cube_r267 = leftCarapace.addOrReplaceChild("cube_r267", CubeListBuilder.create().texOffs(19, 27).addBox(-0.0087F, -0.0186F, 0.1814F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -0.1505F, 0.0698F, 0.4311F));

		PartDefinition cube_r268 = leftCarapace.addOrReplaceChild("cube_r268", CubeListBuilder.create().texOffs(38, 18).addBox(2.9584F, -0.0186F, 0.0177F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -0.1502F, 0.018F, 0.4389F));

		PartDefinition cube_r269 = leftCarapace.addOrReplaceChild("cube_r269", CubeListBuilder.create().texOffs(14, 69).addBox(2.359F, -0.6836F, 4.1309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -0.1768F, 0.3442F, 0.5549F));

		PartDefinition cube_r270 = leftCarapace.addOrReplaceChild("cube_r270", CubeListBuilder.create().texOffs(81, 9).addBox(-0.3758F, -0.2556F, -1.3781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -1.083F, 0.0447F, 0.3463F));

		PartDefinition cube_r271 = leftCarapace.addOrReplaceChild("cube_r271", CubeListBuilder.create().texOffs(81, 6).addBox(-0.3758F, -0.5084F, -2.0208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.8649F, 0.0447F, 0.3463F));

		PartDefinition cube_r272 = leftCarapace.addOrReplaceChild("cube_r272", CubeListBuilder.create().texOffs(35, 71).addBox(-0.3758F, -0.5671F, -1.6461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.6903F, 0.0447F, 0.3463F));

		PartDefinition cube_r273 = leftCarapace.addOrReplaceChild("cube_r273", CubeListBuilder.create().texOffs(69, 9).addBox(-2.0768F, -0.4903F, 1.6582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.4033F, 0.5426F, -0.0863F));

		PartDefinition cube_r274 = leftCarapace.addOrReplaceChild("cube_r274", CubeListBuilder.create().texOffs(52, 39).addBox(-1.3935F, -0.4904F, 0.4032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F))
				.texOffs(31, 52).addBox(-0.9935F, -0.4904F, 0.4032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.3431F, 0.0419F, 0.1153F));

		PartDefinition cube_r275 = leftCarapace.addOrReplaceChild("cube_r275", CubeListBuilder.create().texOffs(40, 53).addBox(-0.3758F, -0.4009F, -2.6241F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.2104F, 0.0447F, 0.3463F));

		PartDefinition cube_r276 = leftCarapace.addOrReplaceChild("cube_r276", CubeListBuilder.create().texOffs(5, 81).addBox(-0.3758F, 2.6641F, -2.1981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.8823F, 0.0447F, 0.3463F));

		PartDefinition cube_r277 = leftCarapace.addOrReplaceChild("cube_r277", CubeListBuilder.create().texOffs(56, 75).addBox(-0.3758F, 0.7948F, -0.8218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -1.5804F, 0.0447F, 0.3463F));

		PartDefinition cube_r278 = leftCarapace.addOrReplaceChild("cube_r278", CubeListBuilder.create().texOffs(66, 75).addBox(-0.3758F, 0.6249F, -2.7617F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.6641F, 0.0447F, 0.3463F));

		PartDefinition cube_r279 = leftCarapace.addOrReplaceChild("cube_r279", CubeListBuilder.create().texOffs(77, 80).addBox(-0.3758F, -0.1954F, -2.8195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.5594F, 0.0447F, 0.3463F));

		PartDefinition cube_r280 = leftCarapace.addOrReplaceChild("cube_r280", CubeListBuilder.create().texOffs(72, 80).addBox(-0.3758F, -0.3655F, -2.7589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.734F, 0.0447F, 0.3463F));

		PartDefinition cube_r281 = leftCarapace.addOrReplaceChild("cube_r281", CubeListBuilder.create().texOffs(67, 80).addBox(-0.3758F, -1.8409F, -2.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(61, 75).addBox(-0.3758F, -1.8409F, -2.2879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.3413F, 0.0447F, 0.3463F));

		PartDefinition cube_r282 = leftCarapace.addOrReplaceChild("cube_r282", CubeListBuilder.create().texOffs(7, 69).addBox(-0.331F, -2.2668F, -1.9199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F))
				.texOffs(68, 58).addBox(-0.331F, -2.2988F, -3.1124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.43F, 0.0403F, 0.3116F));

		PartDefinition cube_r283 = leftCarapace.addOrReplaceChild("cube_r283", CubeListBuilder.create().texOffs(80, 58).addBox(-0.331F, -1.9995F, -2.0401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.3433F, -1.3118F, 8.1617F, -0.6918F, 0.0403F, 0.3116F));

		PartDefinition cube_r284 = leftCarapace.addOrReplaceChild("cube_r284", CubeListBuilder.create().texOffs(0, 40).addBox(3.8086F, -0.6836F, -1.0213F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -0.1677F, -0.1289F, 0.6369F));

		PartDefinition cube_r285 = leftCarapace.addOrReplaceChild("cube_r285", CubeListBuilder.create().texOffs(72, 71).addBox(0.2F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(-1.5F, -5.5105F, 7.5173F, -0.1683F, -0.1721F, 0.0291F));

		PartDefinition cube_r286 = leftCarapace.addOrReplaceChild("cube_r286", CubeListBuilder.create().texOffs(74, 69).addBox(-0.1F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -4.2283F, 7.1693F, -0.3545F, 0.1257F, 0.3265F));

		PartDefinition cube_r287 = leftCarapace.addOrReplaceChild("cube_r287", CubeListBuilder.create().texOffs(51, 28).addBox(-1.3464F, -0.0186F, 5.033F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.5F, -6.789F, 2.782F, -0.1565F, 0.2854F, 0.3972F));

		PartDefinition rightCarapace = Waluchelys.addOrReplaceChild("rightCarapace", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(0.1F, -0.4F, -3.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offset(-2.0F, 0.5F, 0.25F));

		PartDefinition cube_r288 = rightCarapace.addOrReplaceChild("cube_r288", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-3.9984F, -0.0035F, -3.8001F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -0.0712F, -0.0332F, -0.4352F));

		PartDefinition cube_r289 = rightCarapace.addOrReplaceChild("cube_r289", CubeListBuilder.create().texOffs(13, 41).mirror().addBox(-5.937F, -0.6977F, -3.8001F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -0.0644F, -0.045F, -0.6094F));

		PartDefinition cube_r290 = rightCarapace.addOrReplaceChild("cube_r290", CubeListBuilder.create().texOffs(78, 3).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.1F, 4.75F, 0.0F, 0.3927F, 0.0F));

		PartDefinition cube_r291 = rightCarapace.addOrReplaceChild("cube_r291", CubeListBuilder.create().texOffs(5, 78).mirror().addBox(-1.0F, -0.5F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0397F, 0.1F, 6.413F, 0.0F, -0.9076F, 0.0F));

		PartDefinition cube_r292 = rightCarapace.addOrReplaceChild("cube_r292", CubeListBuilder.create().texOffs(11, 47).mirror().addBox(-1.2194F, -0.6459F, -6.1799F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -0.1724F, -0.0816F, -0.0355F));

		PartDefinition cube_r293 = rightCarapace.addOrReplaceChild("cube_r293", CubeListBuilder.create().texOffs(51, 70).mirror().addBox(-0.9664F, -0.724F, 3.099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0733F, -0.0175F, 0.2183F));

		PartDefinition cube_r294 = rightCarapace.addOrReplaceChild("cube_r294", CubeListBuilder.create().texOffs(71, 0).mirror().addBox(-3.5269F, -0.724F, 3.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(70, 37).mirror().addBox(-3.5269F, -0.724F, 1.8132F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0859F, 0.548F, 0.2644F));

		PartDefinition cube_r295 = rightCarapace.addOrReplaceChild("cube_r295", CubeListBuilder.create().texOffs(72, 33).mirror().addBox(-2.5444F, -0.724F, 5.6209F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0787F, 0.3741F, 0.2484F));

		PartDefinition cube_r296 = rightCarapace.addOrReplaceChild("cube_r296", CubeListBuilder.create().texOffs(62, 82).mirror().addBox(-4.0975F, -0.724F, 0.8509F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.1062F, 0.8086F, 0.2966F));

		PartDefinition cube_r297 = rightCarapace.addOrReplaceChild("cube_r297", CubeListBuilder.create().texOffs(23, 7).mirror().addBox(-3.2645F, -0.9589F, -1.9713F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.007F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0F, 1.5708F, 0.2094F));

		PartDefinition cube_r298 = rightCarapace.addOrReplaceChild("cube_r298", CubeListBuilder.create().texOffs(40, 7).mirror().addBox(-2.4645F, -0.2869F, -3.8258F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(46, 62).mirror().addBox(-2.4645F, -0.2869F, -7.2258F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(39, 41).mirror().addBox(-2.2645F, -0.2869F, -6.8258F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0F, 1.5708F, 0.5585F));

		PartDefinition cube_r299 = rightCarapace.addOrReplaceChild("cube_r299", CubeListBuilder.create().texOffs(71, 4).mirror().addBox(0.7567F, -0.2869F, -7.7675F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -3.1416F, 1.0472F, -2.5831F));

		PartDefinition cube_r300 = rightCarapace.addOrReplaceChild("cube_r300", CubeListBuilder.create().texOffs(65, 71).mirror().addBox(-1.426F, -0.2869F, -6.6187F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -3.1416F, 1.3963F, -2.5831F));

		PartDefinition cube_r301 = rightCarapace.addOrReplaceChild("cube_r301", CubeListBuilder.create().texOffs(67, 83).mirror().addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false)
				.texOffs(83, 61).mirror().addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.1052F, -3.0857F, -4.9492F, -1.3055F, 1.16F, -0.545F));

		PartDefinition cube_r302 = rightCarapace.addOrReplaceChild("cube_r302", CubeListBuilder.create().texOffs(55, 63).mirror().addBox(0.0F, -1.0F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-6.3812F, -2.6439F, -1.9948F, -1.5708F, 1.3963F, -1.0123F));

		PartDefinition cube_r303 = rightCarapace.addOrReplaceChild("cube_r303", CubeListBuilder.create().texOffs(49, 11).mirror().addBox(0.0F, -1.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.005F)).mirror(false), PartPose.offsetAndRotation(-4.7699F, -1.637F, -2.1948F, -1.5708F, 1.3526F, -1.0123F));

		PartDefinition cube_r304 = rightCarapace.addOrReplaceChild("cube_r304", CubeListBuilder.create().texOffs(0, 57).mirror().addBox(-1.2645F, -1.018F, -4.1439F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false)
				.texOffs(56, 35).mirror().addBox(-1.2645F, -1.018F, -2.1439F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-3.1755F, -0.6195F, -2.8593F, -0.2483F, 0.8965F, 0.4206F));

		PartDefinition cube_r305 = rightCarapace.addOrReplaceChild("cube_r305", CubeListBuilder.create().texOffs(53, 5).mirror().addBox(3.8049F, 0.0243F, -6.8522F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -3.0652F, 0.4371F, -2.4643F));

		PartDefinition cube_r306 = rightCarapace.addOrReplaceChild("cube_r306", CubeListBuilder.create().texOffs(53, 0).mirror().addBox(-0.5F, -0.575F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.004F)).mirror(false), PartPose.offsetAndRotation(-5.5433F, -2.6447F, 2.9201F, 3.1134F, -0.0504F, -2.6106F));

		PartDefinition cube_r307 = rightCarapace.addOrReplaceChild("cube_r307", CubeListBuilder.create().texOffs(72, 29).mirror().addBox(-3.9115F, -0.219F, -3.6398F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -0.0349F, 1.1345F, 0.5585F));

		PartDefinition cube_r308 = rightCarapace.addOrReplaceChild("cube_r308", CubeListBuilder.create().texOffs(21, 72).mirror().addBox(-4.1241F, -0.2869F, -1.5394F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0F, 0.9599F, 0.5585F));

		PartDefinition cube_r309 = rightCarapace.addOrReplaceChild("cube_r309", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(1.2F, -0.2869F, -3.7411F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, 0.0F, 1.5272F, 0.5585F));

		PartDefinition cube_r310 = rightCarapace.addOrReplaceChild("cube_r310", CubeListBuilder.create().texOffs(58, 71).mirror().addBox(2.1363F, -0.2869F, -3.0429F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -3.1416F, 1.309F, -2.5831F));

		PartDefinition cube_r311 = rightCarapace.addOrReplaceChild("cube_r311", CubeListBuilder.create().texOffs(10, 81).mirror().addBox(2.352F, -0.9589F, 0.4655F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -3.1416F, 0.8378F, -2.9322F));

		PartDefinition cube_r312 = rightCarapace.addOrReplaceChild("cube_r312", CubeListBuilder.create().texOffs(57, 82).mirror().addBox(1.872F, -0.4109F, 2.0723F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1245F, 0.5804F, -1.4593F, -2.8798F, 0.576F, -2.9322F));

		PartDefinition cube_r313 = rightCarapace.addOrReplaceChild("cube_r313", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-3.8322F, -0.4099F, -8.7878F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, 0.0316F, 0.0147F, -0.4361F));

		PartDefinition cube_r314 = rightCarapace.addOrReplaceChild("cube_r314", CubeListBuilder.create().texOffs(32, 34).mirror().addBox(-5.7115F, -1.0699F, -8.7878F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, 0.0286F, 0.02F, -0.6106F));

		PartDefinition cube_r315 = rightCarapace.addOrReplaceChild("cube_r315", CubeListBuilder.create().texOffs(62, 26).mirror().addBox(-3.0F, -1.0F, -2.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 23).mirror().addBox(-3.0F, -1.0F, -0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 20).mirror().addBox(-3.0F, -1.0F, 1.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -4.9917F, -1.5266F, -0.0346F, 0.0043F, 0.1221F));

		PartDefinition cube_r316 = rightCarapace.addOrReplaceChild("cube_r316", CubeListBuilder.create().texOffs(62, 17).mirror().addBox(-3.0F, -0.9868F, -2.08F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(62, 14).mirror().addBox(-3.0F, -0.9868F, -0.08F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -4.569F, 3.9062F, -0.1571F, 0.0F, 0.1222F));

		PartDefinition cube_r317 = rightCarapace.addOrReplaceChild("cube_r317", CubeListBuilder.create().texOffs(9, 62).mirror().addBox(-3.0F, -1.379F, 1.6609F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -4.569F, 3.9062F, -0.3752F, 0.0F, 0.1222F));

		PartDefinition cube_r318 = rightCarapace.addOrReplaceChild("cube_r318", CubeListBuilder.create().texOffs(26, 41).mirror().addBox(-2.0323F, -2.1251F, -11.4935F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.016F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, 0.2302F, 0.106F, -0.4241F));

		PartDefinition cube_r319 = rightCarapace.addOrReplaceChild("cube_r319", CubeListBuilder.create().texOffs(0, 52).mirror().addBox(-5.8976F, -2.1252F, -10.1247F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, 0.2354F, -0.2338F, -0.5044F));

		PartDefinition cube_r320 = rightCarapace.addOrReplaceChild("cube_r320", CubeListBuilder.create().texOffs(44, 69).mirror().addBox(-6.5946F, -2.828F, -9.1247F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, 0.2618F, -0.2037F, -0.6257F));

		PartDefinition cube_r321 = rightCarapace.addOrReplaceChild("cube_r321", CubeListBuilder.create().texOffs(35, 81).mirror().addBox(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false)
				.texOffs(30, 81).mirror().addBox(-1.0F, -0.5F, 0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-4.3962F, -3.8467F, -7.804F, 2.6244F, 1.0325F, 2.1157F));

		PartDefinition cube_r322 = rightCarapace.addOrReplaceChild("cube_r322", CubeListBuilder.create().texOffs(25, 81).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-5.1475F, -3.5468F, -7.2161F, 0.3187F, 0.6285F, -0.3799F));

		PartDefinition cube_r323 = rightCarapace.addOrReplaceChild("cube_r323", CubeListBuilder.create().texOffs(49, 74).mirror().addBox(0.0F, -0.5F, 0.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.017F)).mirror(false), PartPose.offsetAndRotation(-4.8234F, -3.5987F, -7.7183F, 0.294F, -0.506F, -0.7173F));

		PartDefinition cube_r324 = rightCarapace.addOrReplaceChild("cube_r324", CubeListBuilder.create().texOffs(58, 52).mirror().addBox(-6.7523F, -0.1353F, 1.6397F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -0.2366F, 0.7722F, -0.6256F));

		PartDefinition cube_r325 = rightCarapace.addOrReplaceChild("cube_r325", CubeListBuilder.create().texOffs(75, 52).mirror().addBox(6.035F, -0.1353F, -2.442F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.018F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -2.8455F, -0.9575F, 2.4382F));

		PartDefinition cube_r326 = rightCarapace.addOrReplaceChild("cube_r326", CubeListBuilder.create().texOffs(28, 75).mirror().addBox(6.1204F, -0.1353F, 2.2765F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -1.7179F, -1.4002F, 1.2611F));

		PartDefinition cube_r327 = rightCarapace.addOrReplaceChild("cube_r327", CubeListBuilder.create().texOffs(71, 62).mirror().addBox(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-3.5988F, -3.5931F, 8.2432F, -0.4283F, 1.1358F, -0.9594F));

		PartDefinition cube_r328 = rightCarapace.addOrReplaceChild("cube_r328", CubeListBuilder.create().texOffs(60, 10).mirror().addBox(-0.9665F, -0.5F, -0.192F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-6.0989F, -3.2367F, 0.9563F, -0.0648F, 0.3585F, -0.4584F));

		PartDefinition cube_r329 = rightCarapace.addOrReplaceChild("cube_r329", CubeListBuilder.create().texOffs(35, 75).mirror().addBox(-0.317F, -0.5F, -0.933F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-6.0989F, -3.2367F, 0.9563F, -0.3556F, 1.3956F, -0.7862F));

		PartDefinition cube_r330 = rightCarapace.addOrReplaceChild("cube_r330", CubeListBuilder.create().texOffs(72, 74).mirror().addBox(-0.6228F, -0.5F, -0.9464F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-5.8493F, -3.1902F, 2.859F, -0.4791F, 1.3694F, -0.9076F));

		PartDefinition cube_r331 = rightCarapace.addOrReplaceChild("cube_r331", CubeListBuilder.create().texOffs(59, 56).mirror().addBox(-1.053F, -0.5F, -0.418F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-5.8493F, -3.1902F, 2.859F, -0.1296F, 0.7765F, -0.5278F));

		PartDefinition cube_r332 = rightCarapace.addOrReplaceChild("cube_r332", CubeListBuilder.create().texOffs(50, 58).mirror().addBox(-1.053F, -0.5F, -0.418F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-5.4493F, -3.1652F, 4.559F, -0.2038F, 0.9522F, -0.589F));

		PartDefinition cube_r333 = rightCarapace.addOrReplaceChild("cube_r333", CubeListBuilder.create().texOffs(74, 66).mirror().addBox(-0.6228F, -0.5F, -0.9464F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-5.4493F, -3.1652F, 4.559F, -1.589F, 1.4532F, -2.0114F));

		PartDefinition cube_r334 = rightCarapace.addOrReplaceChild("cube_r334", CubeListBuilder.create().texOffs(74, 49).mirror().addBox(-0.7662F, -0.5F, -0.7416F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.016F)).mirror(false), PartPose.offsetAndRotation(-4.5034F, -3.4419F, 6.2284F, -2.3235F, 1.3286F, -2.8702F));

		PartDefinition cube_r335 = rightCarapace.addOrReplaceChild("cube_r335", CubeListBuilder.create().texOffs(41, 58).mirror().addBox(-1.053F, -0.5F, -0.168F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-4.5034F, -3.4419F, 6.2284F, -0.3927F, 1.0958F, -0.8849F));

		PartDefinition cube_r336 = rightCarapace.addOrReplaceChild("cube_r336", CubeListBuilder.create().texOffs(73, 46).mirror().addBox(-6.7196F, -0.4398F, 1.1174F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -0.2127F, 0.593F, -0.687F));

		PartDefinition cube_r337 = rightCarapace.addOrReplaceChild("cube_r337", CubeListBuilder.create().texOffs(84, 27).mirror().addBox(0.4791F, -0.2708F, 5.8256F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false)
				.texOffs(75, 55).mirror().addBox(-1.3841F, -0.2685F, 5.8213F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -0.3878F, -1.0165F, -0.1875F));

		PartDefinition cube_r338 = rightCarapace.addOrReplaceChild("cube_r338", CubeListBuilder.create().texOffs(56, 31).mirror().addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-5.8587F, -2.908F, 4.9883F, -0.5462F, -1.303F, -0.0013F));

		PartDefinition cube_r339 = rightCarapace.addOrReplaceChild("cube_r339", CubeListBuilder.create().texOffs(51, 24).mirror().addBox(-3.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-6.3952F, -2.9218F, 3.0922F, -0.8265F, -1.4686F, 0.2977F));

		PartDefinition cube_r340 = rightCarapace.addOrReplaceChild("cube_r340", CubeListBuilder.create().texOffs(51, 20).mirror().addBox(-3.0F, -0.5F, -2.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-6.7022F, -3.016F, 0.1036F, -2.1048F, -1.5186F, 1.5803F));

		PartDefinition cube_r341 = rightCarapace.addOrReplaceChild("cube_r341", CubeListBuilder.create().texOffs(32, 58).mirror().addBox(0.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-6.3754F, -3.3227F, -4.6337F, 0.1093F, -0.3648F, -0.5552F));

		PartDefinition cube_r342 = rightCarapace.addOrReplaceChild("cube_r342", CubeListBuilder.create().texOffs(9, 58).mirror().addBox(-2.0F, -0.5F, -2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-6.7363F, -3.1832F, -2.6715F, 2.9826F, -1.3761F, 2.7728F));

		PartDefinition cube_r343 = rightCarapace.addOrReplaceChild("cube_r343", CubeListBuilder.create().texOffs(19, 27).mirror().addBox(-2.9913F, -0.0186F, 0.1814F, 3.0F, 1.0F, 5.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -0.1505F, -0.0698F, -0.4311F));

		PartDefinition cube_r344 = rightCarapace.addOrReplaceChild("cube_r344", CubeListBuilder.create().texOffs(38, 18).mirror().addBox(-3.9584F, -0.0186F, 0.0177F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.013F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -0.1502F, -0.018F, -0.4389F));

		PartDefinition cube_r345 = rightCarapace.addOrReplaceChild("cube_r345", CubeListBuilder.create().texOffs(14, 69).mirror().addBox(-3.359F, -0.6836F, 4.1309F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -0.1768F, -0.3442F, -0.5549F));

		PartDefinition cube_r346 = rightCarapace.addOrReplaceChild("cube_r346", CubeListBuilder.create().texOffs(81, 9).mirror().addBox(-0.6242F, -0.2556F, -1.3781F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -1.083F, -0.0447F, -0.3463F));

		PartDefinition cube_r347 = rightCarapace.addOrReplaceChild("cube_r347", CubeListBuilder.create().texOffs(81, 6).mirror().addBox(-0.6242F, -0.5084F, -2.0208F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.8649F, -0.0447F, -0.3463F));

		PartDefinition cube_r348 = rightCarapace.addOrReplaceChild("cube_r348", CubeListBuilder.create().texOffs(35, 71).mirror().addBox(-0.6242F, -0.5671F, -1.6461F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.6903F, -0.0447F, -0.3463F));

		PartDefinition cube_r349 = rightCarapace.addOrReplaceChild("cube_r349", CubeListBuilder.create().texOffs(69, 9).mirror().addBox(1.0768F, -0.4903F, 1.6582F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.143F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.4033F, -0.5426F, 0.0863F));

		PartDefinition cube_r350 = rightCarapace.addOrReplaceChild("cube_r350", CubeListBuilder.create().texOffs(52, 39).mirror().addBox(0.3935F, -0.4904F, 0.4032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.155F)).mirror(false)
				.texOffs(31, 52).mirror().addBox(-0.0065F, -0.4904F, 0.4032F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.3431F, -0.0419F, -0.1153F));

		PartDefinition cube_r351 = rightCarapace.addOrReplaceChild("cube_r351", CubeListBuilder.create().texOffs(40, 53).mirror().addBox(-0.6242F, -0.4009F, -2.6241F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.2104F, -0.0447F, -0.3463F));

		PartDefinition cube_r352 = rightCarapace.addOrReplaceChild("cube_r352", CubeListBuilder.create().texOffs(5, 81).mirror().addBox(-0.6242F, 2.6641F, -2.1981F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.8823F, -0.0447F, -0.3463F));

		PartDefinition cube_r353 = rightCarapace.addOrReplaceChild("cube_r353", CubeListBuilder.create().texOffs(56, 75).mirror().addBox(-0.6242F, 0.7948F, -0.8218F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -1.5804F, -0.0447F, -0.3463F));

		PartDefinition cube_r354 = rightCarapace.addOrReplaceChild("cube_r354", CubeListBuilder.create().texOffs(66, 75).mirror().addBox(-0.6242F, 0.6249F, -2.7617F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.6641F, -0.0447F, -0.3463F));

		PartDefinition cube_r355 = rightCarapace.addOrReplaceChild("cube_r355", CubeListBuilder.create().texOffs(77, 80).mirror().addBox(-0.6242F, -0.1954F, -2.8195F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.5594F, -0.0447F, -0.3463F));

		PartDefinition cube_r356 = rightCarapace.addOrReplaceChild("cube_r356", CubeListBuilder.create().texOffs(72, 80).mirror().addBox(-0.6242F, -0.3655F, -2.7589F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.157F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.734F, -0.0447F, -0.3463F));

		PartDefinition cube_r357 = rightCarapace.addOrReplaceChild("cube_r357", CubeListBuilder.create().texOffs(67, 80).mirror().addBox(-0.6242F, -1.8409F, -2.4879F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false)
				.texOffs(61, 75).mirror().addBox(-0.6242F, -1.8409F, -2.2879F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.149F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.3413F, -0.0447F, -0.3463F));

		PartDefinition cube_r358 = rightCarapace.addOrReplaceChild("cube_r358", CubeListBuilder.create().texOffs(7, 69).mirror().addBox(-0.669F, -2.2668F, -1.9199F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(68, 58).mirror().addBox(-0.669F, -2.2988F, -3.1124F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.43F, -0.0403F, -0.3116F));

		PartDefinition cube_r359 = rightCarapace.addOrReplaceChild("cube_r359", CubeListBuilder.create().texOffs(80, 58).mirror().addBox(-0.669F, -1.9995F, -2.0401F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.3433F, -1.3118F, 8.1617F, -0.6918F, -0.0403F, -0.3116F));

		PartDefinition cube_r360 = rightCarapace.addOrReplaceChild("cube_r360", CubeListBuilder.create().texOffs(0, 40).mirror().addBox(-5.8086F, -0.6836F, -1.0213F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -0.1677F, 0.1289F, -0.6369F));

		PartDefinition cube_r361 = rightCarapace.addOrReplaceChild("cube_r361", CubeListBuilder.create().texOffs(72, 71).mirror().addBox(-2.2F, -0.5F, -0.1F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false), PartPose.offsetAndRotation(1.5F, -5.5105F, 7.5173F, -0.1683F, 0.1721F, -0.0291F));

		PartDefinition cube_r362 = rightCarapace.addOrReplaceChild("cube_r362", CubeListBuilder.create().texOffs(74, 69).mirror().addBox(-1.9F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.0F, -4.2283F, 7.1693F, -0.3545F, -0.1257F, -0.3265F));

		PartDefinition cube_r363 = rightCarapace.addOrReplaceChild("cube_r363", CubeListBuilder.create().texOffs(51, 28).mirror().addBox(-2.6536F, -0.0186F, 5.033F, 4.0F, 1.0F, 1.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -6.789F, 2.782F, -0.1565F, -0.2854F, -0.3972F));

		return LayerDefinition.create(meshdefinition, 90, 90);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}